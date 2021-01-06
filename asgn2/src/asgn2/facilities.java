package asgn2;
abstract class listPackages {
    abstract void typePackages();
    
}
class packages extends listPackages{
    void typePackages(){
        System.out.println("Cruise Packages Offered :\r\n "+"\n1.Package A"+"\n2.Package B"+"\n3.Package C");
    }    
}
