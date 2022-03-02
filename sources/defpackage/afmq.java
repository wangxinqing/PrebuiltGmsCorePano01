package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: afmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afmq extends afmv {
    public final Uri a;
    public final String b;
    public final afmt c;
    public final int d;
    public final amzy e;

    public afmq(Uri uri, String str, afmt afmt, int i, amzy amzy) {
        this.a = uri;
        this.b = str;
        this.c = afmt;
        this.d = i;
        this.e = amzy;
    }

    public final Uri a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final afmt c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final amzy e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afmv) {
            afmv afmv = (afmv) obj;
            return this.a.equals(afmv.a()) && this.b.equals(afmv.b()) && this.c.equals(afmv.c()) && this.d == afmv.d() && anda.a((List) this.e, (Object) afmv.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 106 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DownloadRequest{fileUri=");
        sb.append(valueOf);
        sb.append(", urlToDownload=");
        sb.append(str);
        sb.append(", downloadConstraints=");
        sb.append(valueOf2);
        sb.append(", trafficTag=");
        sb.append(i);
        sb.append(", extraHttpHeaders=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
