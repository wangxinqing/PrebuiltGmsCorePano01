package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;
import com.google.android.gms.identity.accounts.api.AccountData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: jra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jra implements ax {
    private static final anaf f = anaf.a(avhp.INCOMING, Integer.valueOf(R.drawable.quantum_ic_call_received_white_18), avhp.OUTGOING, Integer.valueOf(R.drawable.quantum_ic_call_made_white_18), avhp.MISSED, Integer.valueOf(R.drawable.quantum_ic_call_missed_white_18));
    private static final anaf g;
    private static final anaf h = anaf.a(avhp.INCOMING, Integer.valueOf(R.string.profile_call_type_incoming), avhp.OUTGOING, Integer.valueOf(R.string.profile_call_type_outgoing), avhp.MISSED, Integer.valueOf(R.string.profile_call_type_missed));
    public final View a;
    public final jtf b;
    public final ExpandableLinearLayout c = ((ExpandableLinearLayout) this.a.findViewById(R.id.interactions));
    public final CardButton d;
    public boolean e;
    private final String i;
    private final String j;

    static {
        avhp avhp = avhp.INCOMING;
        Integer valueOf = Integer.valueOf(R.color.profile_call_arrow_green);
        g = anaf.a(avhp, valueOf, avhp.OUTGOING, valueOf, avhp.MISSED, Integer.valueOf(R.color.profile_call_arrow_red));
    }

    public jra(View view, String str, String str2, jtf jtf) {
        this.a = view;
        this.i = str;
        this.j = str2;
        this.b = jtf;
        CardButton cardButton = (CardButton) view.findViewById(R.id.card_button);
        this.d = cardButton;
        cardButton.setOnClickListener(new jqx(this));
        this.a.setVisibility(8);
    }

    private final String a(int i2, int i3, int i4, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context context = this.a.getContext();
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(i3);
        String valueOf = String.valueOf(this.a.getContext().getString(i4));
        String valueOf2 = String.valueOf(str);
        objArr[2] = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        return context.getString(R.string.interactions_entry_content_description, objArr);
    }

    private final View.OnClickListener b(amri amri) {
        return new jqy(this, amri);
    }

    private static final String a(Context context, long j2) {
        if (j2 != 0) {
            return jpp.a(j2 * 1000, System.currentTimeMillis(), context);
        }
        return null;
    }

    public final void a() {
        this.e = false;
        this.d.a();
        this.c.a(3);
    }

    public final void a(amri amri) {
        int i2;
        String str;
        amri amri2;
        this.c.removeAllViews();
        this.a.setVisibility(8);
        if (amri.a() && !((List) amri.b()).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) amri.b()).iterator();
            while (true) {
                i2 = 4;
                if (!it.hasNext()) {
                    break;
                }
                avjj avjj = (avjj) it.next();
                int a2 = avji.a(avjj.b);
                if (!(a2 == 0 || a2 == 1)) {
                    int a3 = avji.a(avjj.b);
                    if (a3 != 0 && a3 == 4) {
                        avhq avhq = avjj.h;
                        if (avhq == null) {
                            avhq = avhq.d;
                        }
                        avhp a4 = avhp.a(avhq.b);
                        if (a4 == null) {
                            a4 = avhp.UNKNOWN_CALL_LOG_TYPE;
                        }
                        if (a4 == avhp.UNKNOWN_CALL_LOG_TYPE) {
                        }
                    }
                    arrayList.add(avjj);
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                avjj avjj2 = (avjj) arrayList.get(i3);
                int a5 = avji.a(avjj2.b);
                if (a5 != 0 && a5 == 2) {
                    ExpandableLinearLayout expandableLinearLayout = this.c;
                    String str2 = avjj2.d;
                    String str3 = avjj2.f;
                    jru a6 = jru.a();
                    a6.a = jpr.a(str2).toString().trim();
                    a6.b = str3;
                    a6.d = uj.b(this.a.getContext(), R.drawable.product_logo_calendar_color_24);
                    a6.f = a(i3 + 1, arrayList.size(), R.string.profile_calendar_card_title, avjj2.d);
                    a6.i = b(jqz.a("android.intent.action.VIEW", avjj2.c));
                    expandableLinearLayout.addView(a6.a(this.a.getContext(), this.c));
                } else {
                    int a7 = avji.a(avjj2.b);
                    if (a7 != 0 && a7 == i2) {
                        ExpandableLinearLayout expandableLinearLayout2 = this.c;
                        String str4 = avjj2.d;
                        avhq avhq2 = avjj2.h;
                        if (avhq2 == null) {
                            avhq2 = avhq.d;
                        }
                        avhp a8 = avhp.a(avhq2.b);
                        if (a8 == null) {
                            a8 = avhp.UNKNOWN_CALL_LOG_TYPE;
                        }
                        long j2 = avjj2.g;
                        jrs jrs = new jrs();
                        jrs.a = this.a.getContext().getResources().getString(((Integer) h.get(a8)).intValue());
                        jrs.c = j2;
                        Context context = this.a.getContext();
                        Drawable b2 = uj.b(context, ((Integer) f.get(a8)).intValue());
                        b2.mutate().setColorFilter(kf.b(context, ((Integer) g.get(a8)).intValue()), PorterDuff.Mode.MULTIPLY);
                        jrs.b = b2;
                        jrs.d = str4;
                        Context context2 = this.a.getContext();
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(i3 + 1);
                        objArr[1] = Integer.valueOf(arrayList.size());
                        Resources resources = this.a.getContext().getResources();
                        anaf anaf = h;
                        avhq avhq3 = avjj2.h;
                        if (avhq3 == null) {
                            avhq3 = avhq.d;
                        }
                        avhp a9 = avhp.a(avhq3.b);
                        if (a9 == null) {
                            a9 = avhp.UNKNOWN_CALL_LOG_TYPE;
                        }
                        objArr[2] = resources.getString(((Integer) anaf.get(a9)).intValue());
                        jrs.f = context2.getString(R.string.interactions_entry_content_description, objArr);
                        jrs.e = b(jqz.a("android.intent.action.DIAL", avjj2.c));
                        Context context3 = this.a.getContext();
                        View inflate = LayoutInflater.from(context3).inflate(R.layout.gm_call_log_interactions_entry, this.c, false);
                        if (!TextUtils.isEmpty(jrs.a)) {
                            TextView textView = (TextView) inflate.findViewById(R.id.text);
                            textView.setText(jrs.a);
                            textView.setVisibility(0);
                        }
                        if (jrs.c != 0) {
                            TextView textView2 = (TextView) inflate.findViewById(R.id.subtext);
                            textView2.setText(jpp.a(jrs.c * 1000, System.currentTimeMillis(), inflate.getContext()));
                            textView2.setVisibility(0);
                        }
                        if (!TextUtils.isEmpty(jrs.d)) {
                            TextView textView3 = (TextView) inflate.findViewById(R.id.phone_number);
                            textView3.setText(jrs.d);
                            textView3.setVisibility(0);
                            inflate.setOnLongClickListener(new jrr(jrs, inflate));
                        }
                        if (jrs.b != null) {
                            ((ImageView) inflate.findViewById(R.id.call_icon)).setImageDrawable(jrs.b);
                        }
                        if (!TextUtils.isEmpty(jrs.f)) {
                            inflate.setContentDescription(jrs.f);
                        }
                        View.OnClickListener onClickListener = jrs.e;
                        if (onClickListener != null) {
                            inflate.setOnClickListener(onClickListener);
                            inflate.setBackgroundResource(jsa.g(context3));
                        }
                        expandableLinearLayout2.addView(inflate);
                    } else {
                        int a10 = avji.a(avjj2.b);
                        if (a10 != 0 && a10 == 3) {
                            if (avjj2.d.isEmpty()) {
                                str = this.a.getContext().getString(R.string.untitled_email_interaction);
                            } else {
                                str = avjj2.d;
                            }
                            ExpandableLinearLayout expandableLinearLayout3 = this.c;
                            long j3 = avjj2.g;
                            jru a11 = jru.a();
                            a11.a = jpr.a(str).toString().trim();
                            a11.b = a(this.a.getContext(), j3);
                            a11.d = uj.b(this.a.getContext(), R.drawable.product_logo_gmail_color_24);
                            a11.f = a(i3 + 1, arrayList.size(), R.string.profile_email_entry_title, str);
                            Context context4 = this.a.getContext();
                            String str5 = avjj2.c;
                            String str6 = this.j;
                            String str7 = this.i;
                            if (str5.isEmpty() || (azhr.b() && TextUtils.isEmpty(jpr.c(str5)))) {
                                amri2 = ampu.a;
                            } else if (str6.equals("com.google.android.apps.bigtop") || str6.equals("com.google.android.apps.inbox")) {
                                String c2 = jpr.c(str5);
                                PackageManager packageManager = context4.getPackageManager();
                                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.google.android.apps.bigtop");
                                if (launchIntentForPackage == null) {
                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.google.android.apps.inbox");
                                }
                                if (launchIntentForPackage != null) {
                                    launchIntentForPackage.setAction("com.google.android.apps.bigtop.intent.VIEW_EMAIL");
                                    launchIntentForPackage.putExtra("plid", c2);
                                    pxz.a(context4, launchIntentForPackage, AccountData.a(str7));
                                    if (!packageManager.queryIntentActivities(launchIntentForPackage, 0).isEmpty()) {
                                        amri2 = amri.c(launchIntentForPackage);
                                    }
                                }
                                amri2 = ampu.a;
                            } else {
                                Intent intent = new Intent("com.google.android.gm.intent.VIEW_PLID");
                                intent.setPackage("com.google.android.gm");
                                intent.putExtra("plid", jpr.c(str5));
                                intent.putExtra("permalink", str5);
                                pxz.a(context4, intent, AccountData.a(str7));
                                amri2 = amri.c(intent);
                            }
                            a11.i = b(amri2);
                            expandableLinearLayout3.addView(a11.a(this.a.getContext(), this.c));
                        } else {
                            ExpandableLinearLayout expandableLinearLayout4 = this.c;
                            String str8 = avjj2.d;
                            long j4 = avjj2.g;
                            jru a12 = jru.a();
                            a12.a = jpr.a(str8).toString().trim();
                            a12.b = a(this.a.getContext(), j4);
                            a12.d = uj.b(this.a.getContext(), R.drawable.quantum_gm_ic_chat_vd_theme_24);
                            a12.f = a(i3 + 1, arrayList.size(), R.string.profile_sms_entry_title, avjj2.d);
                            a12.i = b(jqz.a("android.intent.action.VIEW", avjj2.c));
                            expandableLinearLayout4.addView(a12.a(this.a.getContext(), this.c));
                        }
                    }
                }
                i3++;
                i2 = 4;
            }
            if (this.c.getChildCount() > 3) {
                this.d.setVisibility(0);
                a();
            } else {
                this.d.setVisibility(8);
            }
            if (this.c.getChildCount() != 0) {
                this.a.setVisibility(0);
            }
        }
    }
}
