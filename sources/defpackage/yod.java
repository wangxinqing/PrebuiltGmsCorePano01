package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.plus.audience.AudienceSelectionListCircleView;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;
import java.util.Arrays;

/* renamed from: yod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yod extends yoy {
    private zni F = new znl();
    private final you G = new you(this);
    private final znl H = new znl();
    public boolean a = false;
    public yoc b;
    public yow c;
    public zni d;

    public yod(Context context, yqd yqd, String str, String str2) {
        super(context, yqd, str, str2, true);
    }

    /* access modifiers changed from: protected */
    public final View a(View view, ViewGroup viewGroup, boolean z) {
        yoc yoc = this.b;
        if (yoc != null) {
            yoc.b();
        }
        return super.a(view, viewGroup, z);
    }

    /* access modifiers changed from: protected */
    public final zni c() {
        zni[] zniArr = new zni[4];
        zniArr[0] = this.d;
        zniArr[1] = new znm((yoy) this, (int) R.string.plus_audience_selection_header_circles, (zni) new znh(this.v, this.w));
        zniArr[2] = new znm((yoy) this, (int) R.string.plus_audience_selection_search_google_results, (zni) new znh(this.c, this.y, this.F));
        zniArr[3] = !this.a ? this.H : this.G;
        return new znh(zniArr);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final AudienceSelectionListCircleView a(wzs wzs, View view, ViewGroup viewGroup, boolean z) {
        AudienceSelectionListCircleView a2 = super.a(wzs, view, viewGroup, z);
        a2.d();
        return a2;
    }

    /* access modifiers changed from: protected */
    public AudienceSelectionListPersonView a(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, int i, View view, boolean z2, boolean z3, boolean z4) {
        AudienceSelectionListPersonView a2 = super.a(obj, str, str2, str3, str4, str5, z, i, view, z2, z3, z4);
        a2.d();
        a2.g = true;
        return a2;
    }

    public final void a() {
        this.c = null;
        g();
    }

    public final void a(ilh ilh, boolean z) {
        this.a = z;
        this.F = new yov(this, ilh, ilh.a());
        g();
    }

    public void a(xfj xfj) {
        this.c = new yow(this, Arrays.asList(new xfj[]{xfj}));
        g();
    }
}
