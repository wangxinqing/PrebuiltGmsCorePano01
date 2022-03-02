package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.IOException;
import java.util.Map;
import org.chromium.net.UploadDataProvider;

/* renamed from: oga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class oga extends ogg {
    private boolean a = false;

    protected oga(Context context, HelpConfig helpConfig, Account account, aoru aoru) {
        super(context, helpConfig, account, aoru, (okc) null, 0);
    }

    /* access modifiers changed from: protected */
    public void a(Map map) {
        super.a(map);
        map.put("Content-Type", "application/protobuf");
        if (this.a) {
            map.put("Content-Encoding", "gzip");
        }
    }

    /* access modifiers changed from: protected */
    public void a(nzw nzw) {
    }

    /* access modifiers changed from: protected */
    public final void b(nzw nzw) {
        odu.a(this.c, this.d, nzw);
    }

    /* access modifiers changed from: protected */
    public byte[] d() {
        return j().k();
    }

    /* access modifiers changed from: protected */
    public final String h() {
        return "POST";
    }

    /* access modifiers changed from: protected */
    public final UploadDataProvider i() {
        byte[] d = d();
        try {
            d = oaq.a(d);
            try {
                this.a = true;
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            Log.e("gH_CronetBasePostReq", "Gzip post request bytes failed.", e);
            return new ofz(d);
        }
        return new ofz(d);
    }

    /* access modifiers changed from: protected */
    public final olv j() {
        nzw a2 = nzw.a();
        a2.a = this.c;
        a2.b = this.d;
        a(a2);
        return a2.b();
    }

    protected oga(Context context, HelpConfig helpConfig, aoru aoru) {
        super(context, helpConfig, aoru, (okc) null, 0);
    }

    protected oga(Context context, HelpConfig helpConfig, aoru aoru, okc okc, int i) {
        super(context, helpConfig, aoru, okc, i);
    }
}
