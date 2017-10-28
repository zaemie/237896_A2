package com.uum.assigment2;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

class FindFile {
    public String[] listJavaFile;

    static String[] filterJava(Collection<File> listAllFileName) {
        LinkedList<String> fb = new LinkedList();
        Iterator<File> a = listAllFileName.iterator();
        File c;
        while (a.hasNext()) {
            c = a.next();
            if (c.getName().endsWith(".java")) {
                fb.add(c.getAbsolutePath());
            }
        }
        String[] listJavaFile = new String[fb.size()];
        for (int i = 0; i < fb.size(); i++) {
            listJavaFile[i] = fb.get(i);
        }
        return listJavaFile;
    }
    
}
