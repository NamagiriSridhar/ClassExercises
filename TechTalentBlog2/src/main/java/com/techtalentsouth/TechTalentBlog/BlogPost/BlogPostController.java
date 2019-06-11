package com.techtalentsouth.TechTalentBlog.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BlogPostController {
	@Autowired
	private BlogPostRepository blogPostRepository;
    //private static List<BlogPost> posts = new ArrayList<>();
	@GetMapping(value="/") //or @RequestMapping("/")
	public String index(BlogPost blogPost, Model model)
	{
		//model.addAttribute("posts", blogPostRepository.findAll());
		model.addAttribute("posts", blogPostRepository.findAll());
		//or model.addAttribute("posts",blogPostRepository.findAll());
		return "blogpost/index";
	}
	/*	@PostMapping(value = "/") // website links -displayed in addressbar
	public String addNewBlogPost(BlogPost blogPost, Model model) 
	{
		blogPostRepository.save(new BlogPost(blogPost.getTitle(), blogPost.getAuthor(), blogPost.getBlogEntry()));
		model.addAttribute("title", blogPost.getTitle());
		model.addAttribute("author", blogPost.getAuthor());
		model.addAttribute("blogEntry", blogPost.getBlogEntry());
		return "blogpost/result"; //folder in project - can keep both same
	 }*/
	@GetMapping(value = "/blog_posts/new")
    public String newBlog (BlogPost blogPost) 
	{
        return "blogpost/new";
    }
	@PostMapping(value = "/blog_posts/new")
	public String create(BlogPost blogPost, Model model) 
	{
		blogPostRepository.save(blogPost);
		//posts.add(blogPost);
		model.addAttribute("title", blogPost.getTitle());
		model.addAttribute("author", blogPost.getAuthor());
		model.addAttribute("blogEntry", blogPost.getBlogEntry());
		return "blogpost/result";
	}
	//RequestMapping was old ; getmapping postmapping deletemapping came afterward
	//{} -dynamic
	//@pathvariable annotation helps get id from path in deletemapping ("... {id}")
    @DeleteMapping("/blog_posts/{id}")
    public String deletePostWithId(@PathVariable Long id, BlogPost blogPost) 
    {
    	/*for(int i= 0; i < posts.size(); i++) 
    	{
    		if(id == posts.get(i).getId()) 
    		{
    			posts.remove(i);
    		}
    	}*/
    	//posts.removeIf(posts -> posts.getId().equals(id));//lambda function
        blogPostRepository.deleteById(id);
        return "blogpost/index";//return is used for serving up web pages.By default springboot knows, it has to go to templates
    }
    
    @GetMapping("/blog_posts/{id}")
    public String showPostByID(@PathVariable Long id, Model model)
    {
    	//BlogPost blogPost1 = new BlogPost();//can be null or default blogPost value
    	BlogPost blogPost = blogPostRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid id" + id));//try catch -  IllegalArgumentException thrown when you pass wrong number of arguments
    	model.addAttribute("post",blogPost);
    	return "blogpost/show";
    }
    
    @GetMapping("/blog_posts/update/{id}")// map @symbol route
    public String showUpdateForm(@PathVariable Long id, Model model)//model helps load content into the form
    {
    	BlogPost blogPost = blogPostRepository.findById(id).orElse(null);
    	model.addAttribute("post",blogPost);
    	return "blogpost/update";
    }
    
    @PutMapping("/blog_posts/{id}")
    public String updatePostByID( @PathVariable Long id,Model model, BlogPost post) //wont work unless if it matches th:object in form
    {
    	BlogPost oldblogPost = blogPostRepository.findById(id).orElse(null);
    	oldblogPost.setAuthor(post.getAuthor());
    	oldblogPost.setTitle(post.getTitle());
    	oldblogPost.setBlogEntry(post.getBlogEntry());
    	blogPostRepository.save(oldblogPost);
    	
    	//model returns data to view
    	model.addAttribute("title",oldblogPost.getTitle());
    	model.addAttribute("author",oldblogPost.getAuthor());
    	model.addAttribute("blogEntry",oldblogPost.getBlogEntry());
    	model.addAttribute("id",oldblogPost.getId());
    
    	//model.addAttribute("posts",oldblogPost);

    	return "blogpost/result";
    }
}


