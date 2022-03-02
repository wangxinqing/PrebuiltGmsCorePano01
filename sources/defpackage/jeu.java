package defpackage;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import java.util.List;

/* renamed from: jeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jeu extends AbstractThreadedSyncAdapter {
    private final Context a;
    private final String b;
    private final nko c;

    @Deprecated
    public jeu(Context context, String str) {
        this(context, false, str, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult);

    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        amky amky;
        try {
            nko nko = this.c;
            amky = null;
            if (nko != null) {
                amky = nko.a(nko.a(new jet(str).a), (amsv) null, (Intent) null, false);
            }
            iva.a((Object) this.b);
            Context context = this.a;
            String str2 = this.b;
            jds.a(context, jdl.a((AbstractThreadedSyncAdapter) this, str2), 10, str2, (String) null, 0, (List) null);
            izj.b(a());
            a(account, bundle, str, contentProviderClient, syncResult);
            Context context2 = this.a;
            String str3 = this.b;
            jds.a(context2, jdl.a((AbstractThreadedSyncAdapter) this, str3), 11, str3, (String) null, 0, (List) null);
            if (amky != null) {
                amky.close();
            }
            izj.a();
            return;
        } catch (Throwable th) {
            izj.a();
            throw th;
        }
        throw th;
    }

    public jeu(Context context, boolean z, String str) {
        this(context, z, str, (byte[]) null);
    }

    public jeu(Context context, boolean z, String str, byte[] bArr) {
        super(context, z, false);
        this.a = context.getApplicationContext();
        String valueOf = String.valueOf(izi.a(a()));
        this.b = valueOf.length() == 0 ? new String("sync:") : "sync:".concat(valueOf);
        this.c = new nko(getClass(), str);
    }
}
