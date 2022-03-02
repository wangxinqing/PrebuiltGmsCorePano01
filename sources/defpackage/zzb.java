package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.R;

/* renamed from: zzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zzb {
    public final Context a;
    private final je b;
    private final iwr c;
    private final int d;
    private final int e;
    private final int f;

    public zzb(Context context, int i) {
        this.a = context;
        this.d = i;
        this.c = iwr.a(context.getApplicationContext());
        this.b = new je(context);
        this.e = a(context, (int) R.drawable.quantum_ic_cloud_download_white_24);
        this.f = a(context, (int) R.drawable.quantum_ic_cloud_done_white_24);
    }

    static int a(Context context, int i) {
        try {
            return hdg.a(context, i);
        } catch (Resources.NotFoundException e2) {
            zsi.a().a("Cannot find resource id for notification icon");
            return 17301628;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        a(false);
    }

    private final void a(boolean z) {
        a(!z ? this.e : this.f, 0, 0, !z ? this.a.getString(R.string.common_something_went_wrong) : this.a.getString(R.string.romanesco_contacts_restore_success), true, false);
    }

    public final void a() {
        a(true);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3, String str, boolean z, boolean z2) {
        je jeVar = this.b;
        jeVar.a(i2, i3, false);
        jeVar.e(this.a.getString(R.string.romanesco_contacts_restore_title));
        jeVar.b((CharSequence) str);
        jeVar.b(i);
        jeVar.a(z);
        jeVar.b(z2);
        jeVar.s = "progress";
        this.c.a("romanesco:contacts_restore", this.d, this.b.b());
    }

    public final void a(int i, String str) {
        a(this.e, 500, i, str, false, true);
    }
}
