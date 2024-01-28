package org.example;

//import jdepend.swingui.JDepend;//ui
//import jdepend.textui.JDepend;//text- non-structured
import jdepend.xmlui.JDepend;//text - structtured
public class Test {
    public static void main(String[] args) throws Exception {
        JDepend depend = new JDepend();

        //path of project directory
        String prjDir="T:\\NguyenLeChiDai_Tuan03_KTPM\\test-jdeped";
        depend.addDirectory(prjDir);
        //analyze
        depend.analyze();
    }
}
