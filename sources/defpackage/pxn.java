package defpackage;

import java.io.File;

/* renamed from: pxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxn {
    public final Class a;
    public final auef b;
    public final String c;
    public final File d;

    public pxn(File file, Class cls, auef auef) {
        iva.a((Object) cls, (Object) "Must specify non-null message type class");
        this.d = file;
        this.c = file.getName();
        this.a = cls;
        this.b = auef;
    }

    public final boolean a() {
        if (b()) {
            oso.a("Deleting file %s", (Object) this.c);
            boolean delete = this.d.delete();
            if (!delete) {
                oso.b("Failed to delete file %s", (Object) this.c);
            }
            return delete;
        }
        oso.a("File %s already deleted", (Object) this.c);
        return false;
    }

    public final boolean b() {
        return this.d.exists();
    }
}
