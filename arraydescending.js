function descending()
{
    var arryElements=[3,5,7,9,2,4]
  var sortedArray=  arryElements.sort(function (a,b){
        return b-a
    } )
    console.log(sortedArray)
}
descending()