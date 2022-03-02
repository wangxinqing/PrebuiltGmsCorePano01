package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: hha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hha implements afzq {
    final /* synthetic */ hhc a;
    private final long b;
    private final String c;

    public hha(hhc hhc, long j, String str) {
        this.a = hhc;
        this.b = j;
        this.c = str;
    }

    public final void a(File file, long j) {
        hem.a().a(this.a.b, 57, this.c);
        this.a.a(this.b, j, 8);
    }

    public final void a(File file, afzp afzp) {
        long length = file.length();
        hem a2 = hem.a();
        Context context = this.a.b;
        String str = this.c;
        String valueOf = String.valueOf(afzp.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(":");
        sb.append(valueOf);
        String sb2 = sb.toString();
        if (afzp.a == afzo.HTTP_ERROR) {
            String valueOf2 = String.valueOf(sb2);
            int i = afzp.b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
            sb3.append(valueOf2);
            sb3.append(":");
            sb3.append(i);
            sb2 = sb3.toString();
        }
        String str2 = afzp.c;
        if (str2 != null) {
            String valueOf3 = String.valueOf(sb2);
            String substring = str2.substring(0, Math.min(str2.length(), 20));
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(substring).length());
            sb4.append(valueOf3);
            sb4.append(":");
            sb4.append(substring);
            sb2 = sb4.toString();
        }
        a2.a(context, 58, sb2);
        this.a.a(this.b, length, 16);
    }
}
