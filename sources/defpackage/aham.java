package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: aham  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aham implements ahcn {
    private final ahbj a;

    public aham() {
        this(new ahbj());
    }

    public final String a() {
        return "file";
    }

    public final ahbj b() {
        return this.a;
    }

    public final OutputStream c(Uri uri) {
        File a2 = ahak.a(uri);
        anne.c(a2);
        return new ahbr(new FileOutputStream(a2), a2);
    }

    public final void d(Uri uri) {
        File a2 = ahak.a(uri);
        if (a2.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", new Object[]{uri}));
        } else if (a2.delete()) {
        } else {
            if (!a2.exists()) {
                throw new FileNotFoundException(String.format("%s does not exist", new Object[]{uri}));
            } else {
                throw new IOException(String.format("%s could not be deleted", new Object[]{uri}));
            }
        }
    }

    public final OutputStream e(Uri uri) {
        File a2 = ahak.a(uri);
        anne.c(a2);
        return new ahbr(new FileOutputStream(a2, true), a2);
    }

    public final void f(Uri uri) {
        File a2 = ahak.a(uri);
        if (!a2.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", new Object[]{uri}));
        } else if (!a2.delete()) {
            throw new IOException(String.format("%s could not be deleted", new Object[]{uri}));
        }
    }

    public final boolean g(Uri uri) {
        return ahak.a(uri).isDirectory();
    }

    public final void h(Uri uri) {
        if (!ahak.a(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", new Object[]{uri}));
        }
    }

    public final long i(Uri uri) {
        File a2 = ahak.a(uri);
        if (!a2.isDirectory()) {
            return a2.length();
        }
        return 0;
    }

    public final Iterable j(Uri uri) {
        File a2 = ahak.a(uri);
        if (a2.isDirectory()) {
            File[] listFiles = a2.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String absolutePath = file.getAbsolutePath();
                    if (file.isDirectory() && !absolutePath.endsWith("/")) {
                        absolutePath = String.valueOf(absolutePath).concat("/");
                    }
                    ahai a3 = ahaj.a();
                    a3.b(absolutePath);
                    arrayList.add(a3.a());
                }
                return arrayList;
            }
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", new Object[]{uri}));
        }
        throw new FileNotFoundException(String.format("%s is not a directory", new Object[]{uri}));
    }

    public final File k(Uri uri) {
        return ahak.a(uri);
    }

    public aham(ahbj ahbj) {
        this.a = ahbj;
    }

    public final void a(Uri uri, Uri uri2) {
        File a2 = ahak.a(uri);
        File a3 = ahak.a(uri2);
        anne.c(a3);
        if (!a2.renameTo(a3)) {
            throw new IOException(String.format("%s could not be renamed to %s", new Object[]{uri, uri2}));
        }
    }

    public final InputStream b(Uri uri) {
        File a2 = ahak.a(uri);
        return new ahbq(new FileInputStream(a2), a2);
    }

    public final boolean a(Uri uri) {
        return ahak.a(uri).exists();
    }
}
