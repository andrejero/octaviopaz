//variables
var periodo1;
var periodo2;
var periodo3;
var taller;
var computo;
var promedioGeneral;


taller=6.7;
computo=8.0;
periodo1=(taller + computo )/2;
console.log("El promedio del periodo 1 es:" + periodo1);
taller=5.7;
computo=9.0;
periodo2=(taller + computo )/2;
console.log("El promedio del periodo 2 es:" + periodo2);
taller=9.92;
computo=6.8;
periodo3=(taller + computo )/2;
console.log("El promedio del periodo 3 es:" + periodo3);
promedioGeneral=(periodo1 + periodo2 + periodo3) /3;
console.log("El promedio general es:" + promedioGeneral);
console.log("APROBADO" + promedioGeneral > 6);