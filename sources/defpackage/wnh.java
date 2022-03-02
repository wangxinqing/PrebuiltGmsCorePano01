package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: wnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wnh extends wpc {
    private final Uri a;
    private final String b;

    /* access modifiers changed from: protected */
    public final void a() {
    }

    /* access modifiers changed from: protected */
    public final wpb c(Context context) {
        if (!ayxm.b()) {
            return wpb.d;
        }
        try {
            return wpb.a(new yco(context.getContentResolver().openFileDescriptor(this.a, this.b)), 0, 0, false);
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("FileNotFoundException: ");
            sb.append(valueOf);
            sb.toString();
            return wpb.c;
        }
    }

    public wnh(String str, int i, wmq wmq, Uri uri, String str2) {
        super(str, i, wmq, "GetGalProviderFileDescriptor");
        this.a = uri;
        this.b = str2;
    }
}
