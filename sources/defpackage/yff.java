package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: yff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum yff {
    REGISTRATION;
    
    private final String b;

    private yff() {
        this.b = r3;
    }

    public final File a(Context context) {
        return new File(new File(context.getFilesDir(), "phenotype/flat_file/"), this.b);
    }
}
