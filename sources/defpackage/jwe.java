package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;

/* renamed from: jwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwe extends bwp {
    private final Context c;
    private final Intent d;

    public jwe(Context context, Intent intent) {
        super("GcmBroadcastHandler");
        this.c = context;
        this.d = intent;
    }

    static atxv a(Intent intent) {
        String stringExtra = intent.getStringExtra("fp-cm-gcm-msg");
        if (stringExtra == null || stringExtra.isEmpty()) {
            ((anih) ((anih) bxk.a.c()).a("jwe", "a", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmBroadcastHandler] Empty or Null payload while decoding a context manager gcm message.");
            return null;
        }
        try {
            atxv atxv = (atxv) aucj.a((aucj) atxv.c, Base64.decode(stringExtra, 0), aubs.c());
            new Object[1][0] = atxv;
            return atxv;
        } catch (auda e) {
            ((anih) ((anih) bxk.a.b()).a("jwe", "a", 135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmBroadcastHandler] InvalidProtocolBufferException while parsing the gcm message");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        atxv atxv;
        new Object[1][0] = this.d;
        if (bxk.a(2) && this.d.getExtras() != null) {
            Bundle extras = this.d.getExtras();
            StringBuilder sb = new StringBuilder();
            for (String str : extras.keySet()) {
                sb.append("[");
                sb.append(str);
                sb.append(", ");
                sb.append(extras.getCharSequence(str));
                sb.append("], ");
            }
            Object[] objArr = {this.d, sb.toString()};
        }
        if ("com.google.android.gms.gcm.REGISTERED".equals(this.d.getAction())) {
            chn v = cbi.v();
            if (!TextUtils.isEmpty(v.a())) {
                for (bsz a : cbi.y().a()) {
                    v.a(a, true);
                }
                return;
            }
            return;
        }
        Context context = this.c;
        Intent intent = this.d;
        String a2 = nsp.a(context).a(intent);
        if ("send_error".equals(a2)) {
            new Object[1][0] = intent.getExtras();
            return;
        }
        if ("deleted_messages".equals(a2)) {
            new Object[1][0] = intent.getExtras();
        } else if (!"gcm".equals(a2)) {
            return;
        }
        ckg ckg = null;
        if (this.d.hasExtra("sf-cm-gcm-msg")) {
            cjz z = cbi.z();
            String stringExtra = this.d.getStringExtra("sf-cm-gcm-msg");
            bsz bsz = TextUtils.isEmpty(stringExtra) ? bsz.a : new bsz(stringExtra);
            Object[] objArr2 = {bsz, 0L};
            if (z.a != null) {
                ckg = new ckg(bsz);
            }
            z.a(ckg, 0, 0, "ReadServerFenceUpdatesOperation", bsz.b);
        } else if (this.d.hasExtra("fp-cm-gcm-msg")) {
            String stringExtra2 = this.d.getStringExtra("fp-cm-gcm-msg");
            if (stringExtra2 == null || stringExtra2.isEmpty()) {
                ((anih) ((anih) bxk.a.c()).a("jwe", "a", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmBroadcastHandler] Empty or Null payload while decoding a context manager gcm message.");
                atxv = null;
            } else {
                try {
                    atxv = (atxv) aucj.a((aucj) atxv.c, Base64.decode(stringExtra2, 0), aubs.c());
                    new Object[1][0] = atxv;
                } catch (auda e) {
                    ((anih) ((anih) bxk.a.b()).a("jwe", "a", 135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmBroadcastHandler] InvalidProtocolBufferException while parsing the gcm message");
                    atxv = null;
                }
            }
            if (atxv == null) {
                ((anih) ((anih) bxk.a.b()).a("jwe", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[GcmBroadcastHandler] Could not decode gcm message.");
                return;
            }
            cbi.q().a(juj.a((bsz) null, 10, atxv));
            cbi.z().a();
        }
    }
}
