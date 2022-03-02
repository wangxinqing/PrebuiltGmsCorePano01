package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: dqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqv extends acg implements LoaderManager.LoaderCallbacks {
    public final ou a = new ou();
    public final ou e = new ou();
    public final List f = new ArrayList();
    private final Context g;
    private final int h;

    public dqv(Context context, int i) {
        this.g = context;
        this.h = i;
    }

    public final long J(int i) {
        return (long) ((Integer) this.f.get(i)).intValue();
    }

    public final int a() {
        return this.a.h;
    }

    public final boolean e(int i, int i2) {
        if (this.f.size() <= 1 || i2 <= 0) {
            return false;
        }
        int intValue = ((Integer) this.f.get(i2 - 1)).intValue();
        dqu dqu = new dqu(this);
        if (dqu.compare(Integer.valueOf(intValue), Integer.valueOf(i)) >= 0) {
            return false;
        }
        Collections.sort(this.f, Collections.reverseOrder(dqu));
        as();
        return true;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (this.a.isEmpty() || i != 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return new drc(this.g, -2592000000L + currentTimeMillis, 86400000 + currentTimeMillis, this.h);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r2.g.contains(java.lang.Integer.valueOf(r4)) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r2.h.contains(java.lang.Integer.valueOf(r5)) == false) goto L_0x0098;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onLoadFinished(com.google.android.chimera.Loader r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x00af
            r8 = 0
            r0 = 0
        L_0x0006:
            int r1 = r9.size()
            if (r0 >= r1) goto L_0x00af
            java.lang.Object r1 = r9.get(r0)
            jee r1 = (defpackage.jee) r1
            int r2 = r1.l
            boolean r3 = defpackage.izi.b(r2)
            r4 = 268435200(0xfffff00, float:2.5243164E-29)
            if (r3 == 0) goto L_0x003b
            ou r3 = r7.e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x003a
            ou r3 = r7.e
            r2 = r2 & r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.get(r2)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x0048
        L_0x003a:
            goto L_0x0048
        L_0x003b:
            ou r3 = r7.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.get(r2)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x0048:
            if (r3 == 0) goto L_0x004b
            goto L_0x0050
        L_0x004b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
        L_0x0050:
            ou r2 = r7.a
            java.lang.Object r2 = r2.get(r3)
            dqt r2 = (defpackage.dqt) r2
            if (r2 != 0) goto L_0x005b
            goto L_0x00ab
        L_0x005b:
            jee r5 = r2.b
            int r5 = r5.l
            if (r5 == 0) goto L_0x0093
            int r5 = r1.l
            boolean r6 = defpackage.izi.b(r5)
            if (r6 == 0) goto L_0x0080
            r4 = r4 & r5
            jee r6 = r2.b
            int r6 = r6.l
            if (r5 != r6) goto L_0x0071
            goto L_0x0093
        L_0x0071:
            if (r4 == r6) goto L_0x0093
            java.util.List r5 = r2.g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0080:
            jee r4 = r2.b
            int r4 = r4.l
            if (r5 == r4) goto L_0x0093
            java.util.List r4 = r2.h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            jee r2 = r2.b
            r2.a((defpackage.jee) r1)
        L_0x0098:
            java.util.List r1 = r7.f
            int r1 = r1.indexOf(r3)
            int r2 = r3.intValue()
            boolean r2 = r7.e(r2, r1)
            if (r2 != 0) goto L_0x00ab
            r7.K(r1)
        L_0x00ab:
            int r0 = r0 + 1
            goto L_0x0006
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqv.onLoadFinished(com.google.android.chimera.Loader, java.lang.Object):void");
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.common_network_usage_item, viewGroup, false);
        if (jkr.c() && ((Boolean) jcd.g.c()).booleanValue()) {
            inflate.findViewById(R.id.data_usage_foreground).setVisibility(8);
            inflate.findViewById(R.id.data_usage_background).setVisibility(8);
            inflate.findViewById(R.id.foreground_text).setVisibility(8);
            inflate.findViewById(R.id.background_text).setVisibility(8);
            viewGroup.removeView(inflate.findViewById(R.id.data_usage_foreground));
            viewGroup.removeView(inflate.findViewById(R.id.data_usage_background));
            viewGroup.removeView(inflate.findViewById(R.id.foreground_text));
            viewGroup.removeView(inflate.findViewById(R.id.background_text));
        }
        return new dqs(inflate);
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        String str;
        String str2;
        dqs dqs = (dqs) adl;
        if (!this.a.isEmpty()) {
            dqt dqt = (dqt) this.a.get(Integer.valueOf(((Integer) this.f.get(i)).intValue()));
            boolean z = dqt.e;
            TextView textView = dqs.t;
            CharSequence charSequence = dqt.d;
            if (charSequence == null) {
                charSequence = dqt.a.getString(R.string.common_network_usage_item_title_unknown, new Object[]{Integer.valueOf(dqt.b.l)});
            }
            textView.setText(charSequence);
            TextView textView2 = dqs.u;
            if (!dqt.f) {
                str = jee.a(((jdy) dqt.b).b());
            } else {
                str = jee.a(0);
            }
            textView2.setText(str);
            TextView textView3 = dqs.v;
            if (!dqt.f) {
                str2 = jee.a(((jdy) dqt.b).a());
            } else {
                str2 = jee.a(0);
            }
            textView3.setText(str2);
            dqs.w.setText(jee.a(dqt.b.e()));
            dqs.s.setEnabled(z);
            if (dqt.b()) {
                dqs.s.setOnClickListener(dqt);
            } else {
                dqs.s.setOnClickListener((View.OnClickListener) null);
            }
        }
    }
}
