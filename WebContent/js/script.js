function valid()
{
	var title=document.forms["user"]["title"].value;
	if(title == "" )
	{
		alert("Title is required");
		return false;
	}
	if(title.length<2 || title.length>65)
	 {
		  alert("Title should have 2 to 65 characters.");
		  return false;
	 }
    var gross=document.forms["user"]["gross"].value;
	if(gross == "")
	{
		alert("Box Office is required");
		return false;
	}
	else if(isNaN(gross))
	{
		alert("Box Office has to be a number");
		return false;
	}
	var dateofLaunch=document.forms["user"]["dateofLaunch"].value;
	if(dateofLaunch == "" )
	{
		alert("Date of Launch is required");
		return false;
	}
	var genre=document.forms["user"]["genre"].value;
	if(genre == "" )
	{
		alert("Select one genre");
		return false;
	}
}
	
	
	