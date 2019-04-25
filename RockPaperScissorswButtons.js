
function game(obj)
{
  
   user = obj.id.toString();
   var computer = Math.floor((Math.random() * 3) + 1);

   switch(computer)
    {
        case 1:
            window.alert('Computer selected Rock'); computer = 'rock' ; break;
        case 2:
            window.alert('Computer selected Paper'); computer = 'paper'; break;
        case 3:
            window.alert('Computer selected Scissors');computer = 'scissors'; break; 
    }
   
    if (user == computer)
    {
        document.getElementById("result").innerHTML ="It is a Draw";
    }
    else if ((user == 'paper' && computer== 'rock')||(user=='rock' && computer=='scissors') 
        || (user='scissors'&&computer=='paper'))
    {
        document.getElementById("result").innerHTML="User wins!!";
    }   
    else
    {
         document.getElementById("result").innerHTML="Computer wins";
    }
  }


