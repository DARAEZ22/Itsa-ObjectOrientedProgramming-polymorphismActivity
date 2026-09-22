package polimosphism;

public class Template<t,k,v> {
private t variable1;
private k variable2;
private v variable3;

public Template(t variable1,k variable2,v variable3) {
	this.variable1=variable1;
	this.variable2=variable2;
	this.variable3=variable3;
}

public t getvariable1() {
	return this.variable1;
}
public void setvariable1(t variable1) {
	this.variable1=variable1;
}
public k getvariable2e() {
	return this.variable2;
}
public void setvariable2(k variable2) {
	this.variable2=variable2;
}
public v getvariable3() {
	return this.variable3;
}
public void setvariable3(v variable3) {
	this.variable3=variable3;
}
}
