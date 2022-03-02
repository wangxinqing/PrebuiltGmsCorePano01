package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeSet;

/* renamed from: owe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owe implements Closeable {
    public final File a;
    public final auef b;
    public final owb c;
    public final Object d = new Object();
    public long e;
    public owd f;
    public final Object g = new Object();
    public owc h;
    public volatile String i;
    public volatile String j;
    public final aucd k = aokz.f.o();

    public owe(File file, auef auef, owb owb) {
        this.a = file;
        this.b = auef;
        this.c = owb;
        TreeSet a2 = a();
        while (!a2.isEmpty()) {
            String str = (String) a2.last();
            Long a3 = a(str);
            if (a3 == null) {
                oso.e("Invalid shard name: %s. Shard will be skipped and deleted.", (Object) str);
                a(aonh.INVALID_SHARD_NAME);
                File file2 = new File(file, str);
                if (file2.delete()) {
                    a2 = a();
                } else {
                    a(aonh.SHARD_DELETE_FAILED);
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("Failed to delete file: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            } else {
                this.e = a3.longValue() + 1;
                return;
            }
        }
    }

    public static Long a(String str) {
        if (str.length() == 16) {
            try {
                return Long.valueOf(Long.parseLong(str, 16));
            } catch (NumberFormatException e2) {
            }
        }
        return null;
    }

    public final void b() {
        try {
            this.h.close();
        } catch (IOException e2) {
        }
        if (!this.h.b.delete()) {
            oso.e("Failed to delete file %s", (Object) this.h.b);
            a(aonh.SHARD_DELETE_FAILED);
        }
        this.h = null;
    }

    public final void close() {
        synchronized (this.d) {
            owd owd = this.f;
            if (owd != null) {
                owd.close();
                this.f = null;
                this.j = null;
            }
        }
        synchronized (this.g) {
            owc owc = this.h;
            if (owc != null) {
                owc.close();
                this.h = null;
            }
        }
    }

    public final TreeSet a() {
        TreeSet treeSet = new TreeSet();
        if (!this.a.isDirectory()) {
            oso.e("Request queue work dir \"%s\" disappeared", (Object) this.a);
            a(aonh.WORK_DIR_DISAPPEARED);
            return treeSet;
        }
        String[] list = this.a.list();
        if (list == null) {
            oso.e("Failed to list contents of request queue work dir \"%s\"", (Object) this.a);
            a(aonh.WORK_DIR_LIST_ERROR);
            return treeSet;
        }
        Collections.addAll(treeSet, list);
        return treeSet;
    }

    public final void a(aonh aonh) {
        synchronized (this.k) {
            aucd aucd = this.k;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aokz aokz = (aokz) aucd.b;
            aokz aokz2 = aokz.f;
            aonh.getClass();
            if (!aokz.b.a()) {
                aokz.b = aucj.a(aokz.b);
            }
            aokz.b.d(aonh.a());
        }
    }
}
