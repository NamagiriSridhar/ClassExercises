var hands=['rock', 'paper', 'scissors'];
 
var player1 = {
	name : "player A",
	score : 0,
	getHand: function()
	{
		return hands[parseInt((Math.random()*10)%3)];
	}
};

var player2 = {
	name : "player B",
	score: 0,
	getHand: function()
	{
		return hands[parseInt((Math.random()*10)%3)];
	}
};

function playRound(player1,player2)
{
	var c1 = player1.getHand();
	console.log ("player 1's hand : " + c1);
	var c2 = player2.getHand();
	console.log ("player 2's hand : " + c2);
	 if (c1 == c2)
        {
            console.log("It's a tie");
        }
        else if ((c1 == 'paper' && c2== 'rock')||(c1=='rock' && c2=='scissors') 
            || (c1='scissors' && c2=='paper'))
        {
        	player1.score ++;
        }   
        else
        {
        	player2.score++;
        }
}

function playGame(player1,player2,playUntil)
{
	for(var i=0;i<playUntil;i++)
	{
		playRound(player1,player2);
		if(player1.score>=5 || player2.score >=5)
		{
			if(player1.score > player2.score)
				return player1;
			else
				return player2;
			break;
		}
	}
	return null;
}

while(true)
{
	var winner = playGame(player1,player2,10);
	if(winner != null)
	{
		console.log("The winner is " + winner.name + " Score : " + winner.score);
		break;
	}
}

var player3 = {
	name : "player C",
	score : 0,
	getHand: function()
	{
		return hands[parseInt((Math.random()*10)%3)];
	}
};

var player4 = {
	name : "player D",
	score: 0,
	getHand: function()
	{
		return hands[parseInt((Math.random()*10)%3)];
	}
};

function playTournament()
{
	player1.score = 0;
	player2.score=0;
	while(true)
	{
		var winner1 = playGame(player1,player2,10);
		if(winner1 != null)
		{
			console.log("The winner in the first game is " + winner1.name + " Score : " + winner1.score);
			break;
		}
	}
	while(true)
	{
		var winner2 = playGame(player3,player4,10);
		if(winner2 != null)
		{
			console.log("The winner in the second game is " + winner2.name + " Score : " + winner2.score);
			break;
		}
	}
	while(true)
	{
		var Twinner = playGame(winner1,winner2,10);
		if(Twinner != null)
		{
			console.log("The winner in the final tournament is " + Twinner.name + " Score : " + Twinner.score);
			break;
		}
	}
}
playTournament();