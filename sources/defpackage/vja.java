package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.nearby.sharing.FileAttachment;

/* renamed from: vja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vja {
    public Uri a;
    public long b = -1;
    public int c = 0;
    public String d = "application/octet-stream";
    private final String e;

    public vja(String str) {
        this.e = str;
    }

    public final FileAttachment a() {
        return new FileAttachment(this.e, this.c, this.b, this.a, new Bundle(), this.d);
    }
}
