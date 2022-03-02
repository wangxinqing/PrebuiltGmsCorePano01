package defpackage;

import com.google.android.gms.common.download.DownloadDetails;

/* renamed from: ipm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ipm {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public String e;
    public int f = 0;
    public int g = Integer.MAX_VALUE;

    public ipm(String str, String str2, long j, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }

    public final DownloadDetails a() {
        return new DownloadDetails(this);
    }
}
