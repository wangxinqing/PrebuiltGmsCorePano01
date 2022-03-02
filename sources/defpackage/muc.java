package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.feedback.PreviewChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: muc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class muc extends acg {
    public final PreviewChimeraActivity a;
    boolean e = false;
    private final List f = jir.a();

    public muc(PreviewChimeraActivity previewChimeraActivity) {
        olx olx;
        olw olw;
        this.a = previewChimeraActivity;
        HelpConfig helpConfig = previewChimeraActivity.a;
        if (helpConfig != null) {
            nzw a2 = nzw.a();
            a2.a = this.a;
            a2.b = helpConfig;
            olv b = a2.b();
            oma oma = null;
            if ((b.a & 2) != 0) {
                olx = b.c;
                if (olx == null) {
                    olx = olx.g;
                }
            } else {
                olx = null;
            }
            if (olx != null) {
                a((int) R.string.gf_error_report_sdk_version, olx.d);
                String str = olx.c;
                String str2 = olx.f;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                a((int) R.string.gf_error_report_model, sb.toString());
                a((int) R.string.gf_network_name, olx.e);
                a((int) R.string.gf_locale, olx.b);
            }
            if ((b.a & 1) != 0) {
                olw = b.b;
                if (olw == null) {
                    olw = olw.d;
                }
            } else {
                olw = null;
            }
            if (olw != null) {
                a((int) R.string.gf_error_report_package_name, olw.b);
                a((int) R.string.gf_error_report_package_version, olw.c);
            }
            if ((b.a & 4) != 0 && (oma = b.d) == null) {
                oma = oma.q;
            }
            if (oma != null) {
                String str3 = oma.k;
                int i = oma.j;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 14);
                sb2.append(str3);
                sb2.append(" / ");
                sb2.append(i);
                a((int) R.string.common_app_name, sb2.toString());
                a((int) R.string.gf_error_report_description, oma.c);
            }
            if (helpConfig.E && !helpConfig.G) {
                this.e = true;
                c();
            } else {
                oma oma2 = b.d;
                a((List) (oma2 == null ? oma.q : oma2).e);
            }
            as();
            return;
        }
        throw new IllegalStateException("HelpConfig required but not available.");
    }

    private final void a(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f.add(Pair.create(f(i), str));
        }
    }

    private final String f(int i) {
        return this.a.getString(i);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        new qvr(Looper.getMainLooper()).postDelayed(new mua(this), axgy.e());
    }

    public final int a() {
        int size = this.f.size();
        return this.e ? size + 1 : size;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i) {
        return new mub(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gf_account_and_system_info_viewer_item, viewGroup, false));
    }

    public final String a(String str) {
        return TextUtils.isEmpty(str) ? f(R.string.common_unknown) : str;
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i) {
        mub mub = (mub) adl;
        if (i >= a()) {
            StringBuilder sb = new StringBuilder(85);
            sb.append("Trying to bind ViewHolder for position ");
            sb.append(i);
            sb.append(", but the position is out of bound.");
            Log.w("gF_Acct&SysInfoAdapter", sb.toString());
            return;
        }
        int a2 = a();
        if (i == a2 - 1 && this.e) {
            mub.s.setVisibility(8);
            mub.t.setText(f(R.string.common_loading));
            mub.t.setGravity(17);
        } else if (i < a2) {
            mub.s.setVisibility(0);
            Pair pair = (Pair) this.f.get(i);
            mub.s.setText(jlh.a((String) pair.first));
            mub.t.setText(jlh.a((String) pair.second));
            mub.t.setGravity(0);
        } else {
            StringBuilder sb2 = new StringBuilder(78);
            sb2.append("addViewGroup requested, but position >= item count: ");
            sb2.append(i);
            sb2.append(" >= ");
            sb2.append(a2);
            Log.e("gF_Acct&SysInfoAdapter", sb2.toString());
        }
    }

    public final void a(List list) {
        if (list != null && !list.isEmpty()) {
            if (ofq.b(axqb.e())) {
                ArrayList arrayList = new ArrayList(list);
                Collections.sort(arrayList, new mtz(this));
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    olz olz = (olz) arrayList.get(i);
                    this.f.add(Pair.create(a(olz.b), olz.c));
                }
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                olz olz2 = (olz) it.next();
                this.f.add(Pair.create(a(olz2.b), olz2.c));
            }
        }
    }
}
