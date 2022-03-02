package defpackage;

import android.util.Log;
import java.io.File;

/* renamed from: bls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bls extends blq {
    private final File a;
    private final String b;

    public bls(File file, bmr bmr) {
        this.a = file;
        String str = bmr.a;
        String str2 = bmr.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append("dl-");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(".apk");
        this.b = sb.toString();
    }

    public final String a() {
        return this.b;
    }

    public final String a(File file) {
        if (!this.a.renameTo(file)) {
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
            sb.append("Failed to rename ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            Log.e("FileApkMgr", sb.toString());
            return null;
        }
        String valueOf3 = String.valueOf(file.getAbsolutePath());
        if (valueOf3.length() == 0) {
            new String("Renamed to ");
        } else {
            "Renamed to ".concat(valueOf3);
        }
        return blz.a(file);
    }
}
