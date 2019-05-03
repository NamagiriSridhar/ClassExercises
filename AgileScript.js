$(document).on("click","#btn1",() =>{
  /*$.ajax({
  	url: "http://jsonplaceholder.typicode.com/posts",
  	method:"GET",
  	}).then((posts) => {
	$(".area1").html(" ");
	posts.forEach(post =>{
		var content ="Id = "+ post.id +"  Title = "+ post.title+ " Body = " + post.body;
  		$(".area1").append(content).append($("<br/><br/>"));
	})
  })*/
  getPosts();
 });

$(document).on("click","#btn2",() =>{
  $.ajax({
  	url: "http://jsonplaceholder.typicode.com/posts/10",
  	method:"GET",
  	}).then((post) => {
	$(".area1").html(" ");
	var content ="Id = "+ post.id +"  Title = "+ post.title+ " Body = " + post.body;
	$(".area1").append(content);
  })
});

$(document).on("click","#btn3",() =>{
  $.ajax({
  	url: "http://jsonplaceholder.typicode.com/comments?postId=12",
  	method:"GET",
  	}).then((comments) => {
	$(".area1").html(" ");
	comments.forEach(comment => {
		var content ="Name = "+ comment.name +"  Email = "+ comment.email+ " Body = " + comment.body;
		$(".area1").append(content).append($("<br/><br/>")); 
	})
  })
});

$(document).on("click","#btn4",() =>{
  $.ajax({
  	url: "http://jsonplaceholder.typicode.com/posts?userId=2",
  	method:"GET",
  	}).then((posts) => {
	$(".area1").html(" ");
	posts.forEach(post =>{
		var content ="Id = "+ post.id +"  Title = "+ post.title+ " Body = " + post.body;
  		$(".area1").append(content).append($("<br/><br/>"));
	})
  })
});

$(document).on("click","#btn5",() =>{
 $.ajax({
        url: 'http://jsonplaceholder.typicode.com/posts',
        method: "POST",
        data: {userId:7, title:"City of Ember", body:"You gotta watch it!!! The best"}
        }).then((response) =>
 		{
 			$(".area1").html(" ");
 			var content = "Id of the new post inserted " + response.id;
 			$(".area1").append(content)
 			console.clear();
 			console.log(response.id);
 		})
    });
 

$(document).on("click","#btn6",() =>{
 $.ajax({
        url: 'http://jsonplaceholder.typicode.com/posts/12',
        method: "PUT",
        data: {userId:11, title:"Harry Potter", body:"World of Magic"},
        complete: function(response){
        	$(".area1").html(" ");
        	var content = response.responseJSON;
        	$(".area1").append(content); //not working!!
        	console.clear();
        	console.log(response.responseJSON);
	}
    })
});
 

$(document).on("click","#btn7",() =>{
 $.ajax({
        url: 'http://jsonplaceholder.typicode.com/posts/12',
        method: "PATCH",
        data: { title:"Harry Potter and Sorcerers stone"},
        complete: function(response){
        	$(".area1").html(" ");
        	console.clear();
        	var content = response.responseJSON;
        	$(".area1").append(content); //not working!!
        	console.log(response.responseJSON);
	}
    })
});
 

$(document).on("click","#btn8",() =>{
 $.ajax({
        url: 'http://jsonplaceholder.typicode.com/posts/12',
        method: "DELETE",
        complete: function(response){
        	$(".area1").html(" ");
        	console.clear();
        	var content = response.statusText;
        	$(".area1").append(content); //not working!!
        	console.log(response.statusText);
	}
    })
});



 /* My old code - both works...
 $(document).on("click","#btn9",() =>{
 $.ajax({
     url: "http://jsonplaceholder.typicode.com/posts",
     method:"GET",
     }).then((posts) => {
    $(".area1").html(" ");
    posts.forEach(post =>{
        var content ="Id = "+ post.id +"  Title = "+ post.title+ " Body = " + post.body;
        var url = "http://jsonplaceholder.typicode.com/comments?postId="+post.id;
        var newDiv = $("<div>")
                .addClass("link")
                .attr("data-link",url)
                .append(content)
                .append($("</div>"));
        $(".area1").append(newDiv);
    })
 })
});
*/
  $(document).on('click', '.link', function () {
    $.ajax({
      url: $(this).data('link'),
      method:"GET",
    }).then((comments) => {
  $(".area1").html(" ");
  let back_to_posts = $('<button id="get_posts"  class="btn btn-primary btn-lg" data-link="http://jsonplaceholder.typicode.com/posts" onclick="getPosts()">Back to posts</button>');
  $(".area1").append(back_to_posts).append($("<br/><br/>"));
  comments.forEach(comment => {
    var content ="Name = "+ comment.name +"  Email = "+ comment.email+ " Body = " + comment.body;
    $(".area1").append(content).append($("<br/><br/>")); 
  })
    })
   });

function getPosts()
{
  $.ajax({
    url: "http://jsonplaceholder.typicode.com/posts",
    method:"GET",
    }).then((posts) => {
    $(".area1").html(" ");
    posts.forEach(post =>{
    var content ="Id = "+ post.id +"  Title = "+ post.title+ " Body = " + post.body;
    let tag = $(`<div class="link" data-link="http://jsonplaceholder.typicode.com/comments?postId=${post.id}"></div>`);
    tag.text(content);
    $(".area1").append(tag);
    })
  }) 
}

 
