package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: twe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twe extends twf {
    private final tvo a;
    private final String b;
    private final byte[] f;
    private final boolean g;

    public twe(Context context, ttg ttg, String str, byte[] bArr, tvo tvo) {
        super(context, ttg);
        this.a = tvo;
        this.b = str;
        this.f = bArr;
        byte[] n = ttg.n();
        boolean z = false;
        if (!(n == null || bArr == null)) {
            z = true;
        }
        this.g = z;
    }

    public final aspb a() {
        return !this.g ? aspb.MAGIC_PAIR_START : aspb.SUBSEQUENT_PAIR_START;
    }

    public final aspb b() {
        return !this.g ? aspb.MAGIC_PAIR_END : aspb.SUBSEQUENT_PAIR_END;
    }

    public final void e() {
        super.e();
        tvo tvo = this.a;
        ((udk) thl.a(tvo.d, udk.class)).a = false;
        String string = tvo.d.getString(R.string.common_connecting);
        udg b2 = tvo.b();
        b2.b(string);
        b2.s = "progress";
        b2.e(tvo.c());
        b2.b((CharSequence) string);
        b2.a(0, 0, true);
        String i = tvo.e.i();
        b2.b(tvo.a(DiscoveryChimeraService.a(((udf) thl.a(tvo.d, udf.class)).a).setAction("com.google.android.gms.nearby.discovery.ACTION_MAGIC_PAIR_PAIRING_DISMISS").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", i).putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", udl.a("DEVICES_WITHIN_REACH_REBRANDED"))));
        b2.a(false);
        AccessibilityManager accessibilityManager = (AccessibilityManager) tvo.d.getSystemService("accessibility");
        if (aymw.T() || !accessibilityManager.isTouchExplorationEnabled()) {
            b2.c(tvo.a(new Intent()));
        }
        tvo.a(b2.b(), tvo.a);
    }

    public final String a(aeha aeha, byte[] bArr, arxt arxt, String str) {
        String str2;
        String a2 = super.a(aeha, bArr, arxt, str);
        tvo tvo = this.a;
        if (tvd.a(this.b)) {
            str2 = this.b;
        } else {
            str2 = null;
        }
        tvo.a(str2, arww.a(this.d.m()), a2, str);
        return a2;
    }

    public final void b(String str) {
        super.b(str);
        this.a.a(true, false, this.d.m(), str);
    }

    public final void a(Throwable th) {
        int i;
        String str;
        boolean z;
        super.a(th);
        tvo tvo = this.a;
        byte[] bArr = this.f;
        ((udk) thl.a(tvo.d, udk.class)).a();
        Context context = tvo.d;
        if (!tvo.f) {
            i = R.string.fast_pair_could_not_pair;
        } else {
            i = R.string.fast_pair_unable_to_connect;
        }
        String string = context.getString(i);
        Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
        if (bArr == null) {
            str = tvo.d.getString(!tvo.f ? R.string.fast_pair_tap_to_open_bluetooth_settings : R.string.fast_pair_unable_to_connect_description);
        } else {
            str = tvo.d.getString(R.string.fast_pair_turn_on_bt_device_pairing_mode);
        }
        udg b2 = tvo.b();
        b2.b(string);
        b2.s = "err";
        b2.e(string);
        b2.b((CharSequence) str);
        b2.a(tvo.a(false, intent));
        b2.b(tvo.a(false, (Intent) null));
        tvo.a(b2.b(), tvo.a);
        tvo tvo2 = this.a;
        byte[] bArr2 = this.f;
        String str2 = this.b;
        if (aymw.a.a().as() && aymt.s().equals(str2)) {
            String a2 = ((tso) thl.a(tvo2.d, tso.class)).a("fast_pair_send_feedback_title", new Object[0]);
            udg b3 = tvo2.b();
            b3.a("DEVICES_REBRANDED");
            b3.b(a2);
            b3.s = "err";
            b3.e(a2);
            b3.b((CharSequence) ((tso) thl.a(tvo2.d, tso.class)).a("fast_pair_send_feedback_text", new Object[0]));
            udf udf = (udf) thl.a(tvo2.d, udf.class);
            if (bArr2 == null) {
                z = true;
            } else {
                z = false;
            }
            b3.a(tvo2.a(DiscoveryChimeraService.a(udf.a).setAction("com.google.android.gms.nearby.discovery.ACTION_USER_FEEDBACK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_IS_INITIAL_PAIRING", z)));
            tvo2.a(b3.b(), tvo.c);
        }
        this.a.a(false, false, this.d.m(), (String) null);
    }
}
