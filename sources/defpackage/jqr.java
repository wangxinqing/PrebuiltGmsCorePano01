package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.identity.accounts.api.AccountData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: jqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jqr implements ax {
    public final jtf a;
    public final View b;
    private int c;
    private final CardButton d;
    private final jsx e;

    public jqr(View view, jsx jsx, jtf jtf) {
        this.e = jsx;
        this.a = jtf;
        this.b = view;
        this.d = (CardButton) view.findViewById(R.id.card_button);
        view.setVisibility(8);
    }

    public final void a(amri amri) {
        this.c = 340;
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.photos);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setVisibility(4);
        }
        this.b.setVisibility(8);
        if (amri.a() && ((jsn) amri.b()).a().a.size() != 0) {
            jsn jsn = (jsn) amri.b();
            aucx aucx = jsn.a().a;
            ArrayList arrayList = new ArrayList();
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                avjr avjr = (avjr) aucx.get(i2);
                if (!avjr.a.isEmpty()) {
                    arrayList.add(avjr.a);
                }
            }
            ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(R.id.photos);
            int childCount = viewGroup2.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup2.getChildAt(i3);
                if (i3 < arrayList.size()) {
                    int i4 = this.c;
                    this.c = i4 + 1;
                    this.e.a((String) arrayList.get(i3), i4, new jqp(childAt));
                }
            }
            this.d.setVisibility(8);
            if (jsn.b().a() && !TextUtils.isEmpty((CharSequence) jsn.b().b())) {
                amri b2 = jsn.b();
                amri c2 = jsn.c();
                amri d2 = jsn.d();
                Context context = this.b.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://get.google.com/albumarchive/%s", new Object[]{(String) b2.b()})));
                PackageManager packageManager = context.getPackageManager();
                Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (!"com.android.chrome".equals(next.activityInfo.packageName) && !"com.android.browser".equals(next.activityInfo.packageName) && packageManager.checkSignatures("com.google.android.gms", next.activityInfo.packageName) == 0) {
                        intent.setPackage(next.activityInfo.packageName);
                        if (c2.a() && !((String) c2.b()).isEmpty()) {
                            if (!d2.a() || ((String) d2.b()).isEmpty()) {
                                pxz.a(context, intent, AccountData.a((String) c2.b()));
                            } else if (!((String) d2.b()).isEmpty()) {
                                pxz.a(context, intent, AccountData.a((String) c2.b(), (String) d2.b()));
                            }
                        }
                    }
                }
                if (intent.resolveActivity(this.b.getContext().getPackageManager()) != null) {
                    this.d.a((int) R.string.photos_see_all);
                    this.d.b(R.drawable.quantum_ic_google_vd_theme_24);
                    this.d.setOnClickListener(new jqq(this, intent));
                    this.d.setVisibility(0);
                }
            }
            if (!arrayList.isEmpty()) {
                this.b.setVisibility(0);
            }
        }
    }
}
