
function solution(X, Y, D) {
    var top = Y-X;
    
    if (top>0) {
      if (top % D === 0) {
          return top / D;
      } else {
          return Math.floor((top / D)+1);
      }
    } else
    {
        return 0;
    }
}