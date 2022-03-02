package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: yci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yci {
    public final ParcelFileDescriptor a;
    public final ParcelFileDescriptor b;

    private yci(File file) {
        this.a = ParcelFileDescriptor.open(file, 268435456);
        try {
            this.b = ParcelFileDescriptor.open(file, 268435456);
        } catch (Exception e) {
            jjt.a(this.a);
            throw e;
        }
    }

    public static yci a(File file) {
        return new yci(file);
    }
}
