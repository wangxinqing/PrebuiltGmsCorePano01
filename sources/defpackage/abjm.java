package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: abjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abjm implements abir, abkd {
    public final Context a;
    public final jtf b;
    private final abke c;
    private final String d;
    private final String e;
    private List f;

    public abjm(Context context, BaseCardView baseCardView, List list, avjk avjk, String str, String str2, jtf jtf, Bundle bundle) {
        boolean z;
        String str3;
        Intent intent;
        abkf abkf;
        int i;
        Drawable drawable;
        String str4;
        String str5;
        String str6;
        int a2;
        Context context2 = context;
        BaseCardView baseCardView2 = baseCardView;
        avjk avjk2 = avjk;
        Bundle bundle2 = bundle;
        this.d = str;
        this.e = str2;
        this.b = jtf;
        ArrayList arrayList = new ArrayList(list);
        this.f = arrayList;
        int i2 = 3;
        int i3 = 1;
        if (avjk2 != null) {
            ArrayList arrayList2 = new ArrayList();
            aucx aucx = avjk2.a;
            int size = aucx.size();
            for (int i4 = 0; i4 < size; i4++) {
                avjj avjj = (avjj) aucx.get(i4);
                if (!((avjj.a & 1) == 0 || (a2 = avji.a(avjj.b)) == 0 || a2 != 3)) {
                    arrayList2.add(avjj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        Collections.sort(this.f, abjk.a);
        if (this.f.size() > 10) {
            this.f = this.f.subList(0, 10);
        }
        this.a = context2;
        abjl abjl = new abjl(context2);
        int i5 = 0;
        while (i5 < this.f.size()) {
            avjj avjj2 = (avjj) this.f.get(i5);
            if ((avjj2.a & i3) != 0) {
                avhp avhp = avhp.UNKNOWN_CALL_LOG_TYPE;
                int a3 = avji.a(avjj2.b);
                int i6 = (a3 == 0 ? 1 : a3) - 1;
                if (i6 == i3) {
                    abjl.a(a(i5 + 1, R.string.profile_calendar_card_title, R.drawable.calendar_interaction, avjj2.d, avjj2.f, a("android.intent.action.VIEW", avjj2.c)));
                } else if (i6 == 2) {
                    int i7 = i5 + 1;
                    String str7 = avjj2.d;
                    if ((avjj2.a & 512) != 0) {
                        str3 = jpp.a(avjj2.g * 1000, System.currentTimeMillis(), context2);
                    } else {
                        str3 = null;
                    }
                    if ((avjj2.a & 16) == 0 || (azhr.b() && TextUtils.isEmpty(jpr.c(avjj2.c)))) {
                        intent = null;
                    } else if (!this.e.equals("com.google.android.apps.bigtop") && !this.e.equals("com.google.android.apps.inbox")) {
                        Context context3 = this.a;
                        String str8 = avjj2.c;
                        String str9 = this.d;
                        Intent intent2 = new Intent("com.google.android.gm.intent.VIEW_PLID");
                        intent2.setPackage("com.google.android.gm");
                        intent2.putExtra("plid", jpr.c(str8));
                        intent2.putExtra("permalink", str8);
                        pxz.a(context3, intent2, AccountData.a(str9));
                        intent = intent2;
                    } else {
                        Context context4 = this.a;
                        String c2 = jpr.c(avjj2.c);
                        String str10 = this.d;
                        PackageManager packageManager = context4.getPackageManager();
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.google.android.apps.bigtop");
                        launchIntentForPackage = launchIntentForPackage == null ? packageManager.getLaunchIntentForPackage("com.google.android.apps.inbox") : launchIntentForPackage;
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.setAction("com.google.android.apps.bigtop.intent.VIEW_EMAIL");
                            launchIntentForPackage.putExtra("plid", c2);
                            pxz.a(context4, launchIntentForPackage, AccountData.a(str10));
                            if (!packageManager.queryIntentActivities(launchIntentForPackage, 0).isEmpty()) {
                                intent = launchIntentForPackage;
                            }
                        }
                        intent = null;
                    }
                    abjl.a(a(i7, R.string.profile_email_entry_title, R.drawable.email_interaction, str7, str3, intent));
                } else if (i6 == i2) {
                    int i8 = i5 + 1;
                    Intent a4 = a("android.intent.action.DIAL", avjj2.c);
                    avhq avhq = avjj2.h;
                    if (((avhq == null ? avhq.d : avhq).a & i3) != 0) {
                        avhq avhq2 = avjj2.h;
                        avhp a5 = avhp.a((avhq2 == null ? avhq.d : avhq2).b);
                        int ordinal = (a5 == null ? avhp.UNKNOWN_CALL_LOG_TYPE : a5).ordinal();
                        if (ordinal == i3) {
                            Drawable b2 = uj.b(this.a, R.drawable.quantum_ic_call_received_white_18);
                            b2.setColorFilter(kf.b(this.a, R.color.profile_call_arrow_green), PorterDuff.Mode.MULTIPLY);
                            drawable = b2;
                            i = R.string.profile_call_type_incoming;
                        } else if (ordinal == 2) {
                            Drawable b3 = uj.b(this.a, R.drawable.quantum_ic_call_made_white_18);
                            b3.setColorFilter(kf.b(this.a, R.color.profile_call_arrow_green), PorterDuff.Mode.MULTIPLY);
                            drawable = b3;
                            i = R.string.profile_call_type_outgoing;
                        } else if (ordinal != i2) {
                            abkf = null;
                        } else {
                            drawable = uj.b(this.a, R.drawable.quantum_ic_call_missed_white_18);
                            drawable.mutate().setColorFilter(kf.b(this.a, R.color.profile_call_arrow_red), PorterDuff.Mode.MULTIPLY);
                            i = R.string.profile_call_type_missed;
                        }
                        String str11 = avjj2.d;
                        if ((avjj2.a & 512) != 0) {
                            str4 = str11;
                            str5 = jpp.a(avjj2.g * 1000, System.currentTimeMillis(), this.a);
                        } else {
                            str4 = str11;
                            str5 = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.interactions_entry, (ViewGroup) null);
                        ((ImageView) viewGroup.findViewById(R.id.icon)).setImageDrawable(uj.b(this.a, R.drawable.call_interaction));
                        TextView textView = (TextView) viewGroup.findViewById(R.id.text);
                        textView.setText(i);
                        ((ImageView) viewGroup.findViewById(R.id.call_icon)).setImageDrawable(drawable);
                        if (!TextUtils.isEmpty(str4)) {
                            ((TextView) viewGroup.findViewById(R.id.phone_number)).setText(str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            ((TextView) viewGroup.findViewById(R.id.subtext)).setText(str5);
                        }
                        viewGroup.setOnClickListener(new abji(this, a4));
                        textView.setContentDescription(this.a.getString(R.string.interactions_entry_content_description, new Object[]{Integer.valueOf(i8), Integer.valueOf(this.f.size()), this.a.getString(i)}));
                        abkf = new abkf(viewGroup);
                    } else {
                        abkf = null;
                    }
                    if (abkf != null) {
                        abjl.a(abkf);
                    }
                } else if (i6 == 4) {
                    int i9 = i5 + 1;
                    String str12 = avjj2.d;
                    if ((avjj2.a & 512) != 0) {
                        str6 = jpp.a(avjj2.g * 1000, System.currentTimeMillis(), context2);
                    } else {
                        str6 = null;
                    }
                    abjl.a(a(i9, R.string.profile_sms_entry_title, R.drawable.sms_interaction, str12, str6, a("android.intent.action.VIEW", avjj2.c)));
                }
            }
            i5++;
            i2 = 3;
            i3 = 1;
        }
        if (!abjl.d()) {
            ViewGroup viewGroup2 = abjl.c;
            if (viewGroup2.getChildCount() > 0) {
                viewGroup2.getChildAt(0).findViewById(R.id.top_divider).setVisibility(4);
                viewGroup2.getChildAt(viewGroup2.getChildCount() - 1).findViewById(R.id.bottom_divider).setVisibility(4);
            }
            baseCardView2.a((int) R.string.interactions_card_title);
            TextView textView2 = (TextView) baseCardView2.findViewById(R.id.title);
            boolean z2 = false;
            textView2.setPadding(textView2.getPaddingLeft(), 0, textView2.getPaddingRight(), 0);
            baseCardView2.findViewById(R.id.card_content).setPadding(0, 0, 0, 0);
            if (bundle2 == null || !bundle2.getBoolean("recentInteractionsCardController")) {
                z = false;
            } else {
                z = true;
            }
            this.c = new abke(baseCardView, abjl, this, this.f.size() > 3 ? true : z2, z);
            return;
        }
        this.c = null;
        baseCardView2.setVisibility(8);
    }

    private final abkf a(int i, int i2, int i3, String str, String str2, Intent intent) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.interactions_entry, (ViewGroup) null);
        viewGroup.findViewById(R.id.call_icon).setVisibility(8);
        viewGroup.findViewById(R.id.phone_number).setVisibility(8);
        ((ImageView) viewGroup.findViewById(R.id.icon)).setImageDrawable(uj.b(this.a, i3));
        if (!TextUtils.isEmpty(str)) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.text);
            textView.setText(jpr.a(str).toString().trim());
            Context context = this.a;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(this.f.size());
            String valueOf = String.valueOf(this.a.getString(i2));
            String valueOf2 = String.valueOf(str);
            objArr[2] = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            textView.setContentDescription(context.getString(R.string.interactions_entry_content_description, objArr));
        }
        if (!TextUtils.isEmpty(str2)) {
            ((TextView) viewGroup.findViewById(R.id.subtext)).setText(str2);
        }
        viewGroup.setOnClickListener(new abjj(this, intent));
        return new abkf(viewGroup);
    }

    public final void b() {
        this.b.a(jth.SEE_LESS_BUTTON, jth.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
    }

    private static final Intent a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new Intent(str).setData(Uri.parse(str2));
    }

    public final void a() {
        this.b.a(jth.SEE_MORE_BUTTON, jth.SMART_PROFILE_RECENT_INTERACTIONS_CARD);
    }

    public final void a(Bundle bundle) {
        abke abke = this.c;
        if (abke != null) {
            bundle.putBoolean("recentInteractionsCardController", abke.b);
        }
    }
}
