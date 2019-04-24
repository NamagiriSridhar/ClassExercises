

var billAmount=100;
function gratuity(amount)
{
	return amount*0.2;
}

function totalWithGrat(amount)
{
	return amount+gratuity(amount);
}

console.log("your total including gratuity is:" + parseFloat(totalWithGrat(billAmount)).toFixed(2)); // It is trying to add decimals to string . Had to add parseFloat to make it work