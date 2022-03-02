package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.material.button.MaterialButton;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: jqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jqw implements ax {
    public final View a;
    public final jsx b;
    public final jtf c;
    private final ViewGroup d;
    private final CardButton e;
    private final List f = new ArrayList();

    public jqw(View view, jsx jsx, jtf jtf) {
        this.a = view;
        this.d = (ViewGroup) view.findViewById(R.id.posts);
        this.e = (CardButton) view.findViewById(R.id.card_button);
        this.b = jsx;
        this.c = jtf;
        view.setVisibility(8);
        for (int i = 0; i < this.d.getChildCount(); i++) {
            this.f.add(new jqv(this, this.d.getChildAt(i)));
        }
    }

    public final void a(amri amri) {
        anhk anhk;
        Intent intent;
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(R.id.posts);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setVisibility(4);
        }
        this.a.setVisibility(8);
        if (amri.a() && !((jsp) amri.b()).a().isEmpty()) {
            jsp jsp = (jsp) amri.b();
            anhk i2 = jsp.a().listIterator();
            List list = this.f;
            int size = list.size();
            int i3 = 320;
            int i4 = 0;
            while (i4 < size) {
                jqv jqv = (jqv) list.get(i4);
                if (i2.hasNext()) {
                    int i5 = i3 + 1;
                    avim avim = (avim) i2.next();
                    amri c2 = jsp.c();
                    amri d2 = jsp.d();
                    if ((avim.a & 2) != 0) {
                        avin avin = avim.c;
                        if (avin == null) {
                            avin = avin.b;
                        }
                        if (!avin.a.isEmpty()) {
                            jsx jsx = jqv.e.b;
                            avin avin2 = avim.c;
                            if (avin2 == null) {
                                avin2 = avin.b;
                            }
                            jsx.a(avin2.a, i3, new jqt(jqv));
                        }
                    }
                    if (!avim.b.isEmpty()) {
                        SpannableString spannableString = new SpannableString(jpr.a(avim.b).toString());
                        jpr.a((Spannable) spannableString, -1);
                        jqv.c.setText(spannableString.toString());
                    }
                    if ((avim.a & 32) == 0 || avim.e == 0) {
                        anhk = i2;
                    } else {
                        anhk = i2;
                        jqv.d.setText(DateFormat.getDateInstance(1).format(new Date(avim.e)));
                    }
                    if (!avim.d.isEmpty()) {
                        String str = avim.d;
                        Context context = jqv.e.a.getContext();
                        if (!TextUtils.isEmpty(str)) {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
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
                                        pxz.a(context, intent, (!d2.a() || ((String) d2.b()).isEmpty()) ? AccountData.a((String) c2.b()) : AccountData.a((String) c2.b(), (String) d2.b()));
                                    }
                                }
                            }
                        } else {
                            intent = null;
                        }
                        jqv.a.setOnClickListener(new jqu(jqv, intent));
                    }
                    jqv.a(0);
                    i3 = i5;
                } else {
                    anhk = i2;
                    jqv.a(4);
                }
                i4++;
                i2 = anhk;
            }
            this.e.setVisibility(8);
            if (jsp.b().a() && !TextUtils.isEmpty((CharSequence) jsp.b().b())) {
                amri b2 = jsp.b();
                amri c3 = jsp.c();
                amri d3 = jsp.d();
                Context context2 = this.a.getContext();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(String.format("https://plus.google.com/%s", new Object[]{(String) b2.b()})));
                Intent intent3 = (Intent) intent2.clone();
                intent3.setPackage("com.google.android.apps.plus");
                if (context2.getPackageManager().resolveActivity(intent3, 0) != null) {
                    if (c3.a() && !((String) c3.b()).isEmpty()) {
                        pxz.a(context2, intent3, (!d3.a() || ((String) d3.b()).isEmpty()) ? AccountData.a((String) c3.b()) : AccountData.a((String) c3.b(), (String) d3.b()));
                    }
                    intent2 = intent3;
                }
                if (intent2 == null || intent2.resolveActivity(this.a.getContext().getPackageManager()) == null) {
                    this.e.setVisibility(8);
                } else {
                    this.e.a((int) R.string.posts_see_all);
                    this.e.setContentDescription(this.a.getContext().getString(R.string.posts_see_all_content_description));
                    if (azhr.a.a().b()) {
                        CardButton cardButton = this.e;
                        MaterialButton materialButton = cardButton.a;
                        int dimensionPixelSize = cardButton.getContext().getResources().getDimensionPixelSize(R.dimen.card_button_icon_padding_gplus_card);
                        if (materialButton.c != dimensionPixelSize) {
                            materialButton.c = dimensionPixelSize;
                            materialButton.setCompoundDrawablePadding(dimensionPixelSize);
                        }
                    }
                    this.e.b(R.drawable.quantum_ic_google_plus_vd_theme_24);
                    this.e.setOnClickListener(new jqs(this, intent2));
                    this.e.setVisibility(0);
                }
            }
            this.a.setVisibility(0);
        }
    }
}
