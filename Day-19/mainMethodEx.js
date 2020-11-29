
function odd_even(){
	var a;
	a= Number(document.getElementById("input_num").value);
	if(a%2==0)
	{
		document.write("even number");
		}
		else
		{
			document.write("odd number");
			prime();
			}

}
function prime(){
var a,i,flag=true;
a=Number(document.getElementById("input_num").value);
for(i=2;i<=a;i++)
	{
	if(a%i==0)
		{
		flag=false;
		break;
		}
		if(falg==true)
		{
		alert("prime");
		document.write("prime number");
		}
		else{
		alert("not prime");
		}
		
	}
}

