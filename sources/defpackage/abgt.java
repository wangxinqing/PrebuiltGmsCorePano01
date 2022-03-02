package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.SmartProfileChimeraActivity;
import com.google.android.gms.smart_profile.SmartProfileContainerView;
import com.google.android.gms.smart_profile.SmartProfilePerson;
import com.google.android.gms.smart_profile.header.view.HeaderView;
import java.util.List;
import java.util.Set;

/* renamed from: abgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgt implements abfk {
    public abfn a;
    public abfl b;
    public abhf c;
    public SmartProfileContainerView d;
    public HeaderView e;
    public abku f;
    public abgb g;
    public abkq h;
    public abkz i;
    public abkl j;
    public abmf k;
    public jtf l;
    public abmb m;
    public ablh n;
    public final /* synthetic */ SmartProfileChimeraActivity o;

    public abgt() {
    }

    public final void a() {
        SmartProfileContainerView smartProfileContainerView = this.d;
        if (smartProfileContainerView.e.getVisibility() != 0) {
            smartProfileContainerView.e.setVisibility(0);
        }
        if (smartProfileContainerView.d.getVisibility() == 0) {
            smartProfileContainerView.d.setVisibility(8);
            smartProfileContainerView.g.a();
        }
    }

    public final void b() {
        if (!azig.b() || !azia.a.a().b()) {
            akax a2 = akax.a((View) this.d, (int) R.string.no_network_connection, (int) azje.c());
            a2.a(R.string.common_retry, new abgr(this));
            a2.b(kf.b(this.o, R.color.snackbar_button_color));
            a2.c();
            return;
        }
        Context context = this.d.getContext();
        int c2 = (int) azje.c();
        if (azia.a.a().c()) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) {
                c2 = -2;
            }
        }
        SpannableString spannableString = new SpannableString(this.d.getResources().getString(R.string.no_network_connection));
        spannableString.setSpan(new ForegroundColorSpan(jsa.e(context)), 0, spannableString.length(), 0);
        akax a3 = akax.a((View) this.d, (CharSequence) spannableString, c2);
        a3.a(R.string.common_retry, new abgq(this));
        a3.b(jsa.d(context));
        a3.c(jsa.c(context));
        a3.c();
    }

    public final boolean c() {
        return jkf.a(this.o);
    }

    public abgt(SmartProfileChimeraActivity smartProfileChimeraActivity) {
        this.o = smartProfileChimeraActivity;
    }

    public final void a(SmartProfilePerson smartProfilePerson) {
        SmartProfilePerson smartProfilePerson2 = new SmartProfilePerson(smartProfilePerson, this.o.getIntent().getStringExtra("com.google.android.gms.people.smart_profile.DISPLAY_PHONE"), this.o.getIntent().getStringExtra("com.google.android.gms.people.smart_profile.DISPLAY_EMAIL"), this.o.getResources().getString(R.string.profile_communicate_email));
        abhf abhf = this.c;
        abhf.c = smartProfilePerson2;
        abhf.a();
        LoaderManager loaderManager = this.o.getLoaderManager();
        SmartProfileChimeraActivity smartProfileChimeraActivity = this.o;
        abij abij = new abij(loaderManager, smartProfilePerson2, smartProfileChimeraActivity.m, smartProfileChimeraActivity);
        abie abie = new abie(abij, new abfm(this.a));
        abij.e = new abik((byte[]) null);
        abij.a.initLoader(1, (Bundle) null, new abif(abij));
        abij.f = new abik((byte[]) null);
        abij.a.initLoader(2, (Bundle) null, new abig(abij));
        abij.g = new abik((byte[]) null);
        abij.a.initLoader(3, (Bundle) null, new abih(abij));
        new abid(abie, new abic(new abik[]{abij.e, abij.f, abij.g}).a);
        abkl abkl = this.j;
        List list = abkl.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((abkj) list.get(i2)).a(smartProfilePerson2);
        }
        abkl.b = smartProfilePerson2;
        abkl.e = 1;
        Set a2 = abkl.a(abkl.b);
        if (!a2.isEmpty()) {
            ablu ablu = abkl.c;
            ablu.a.restartLoader(10, (Bundle) null, new ablr(ablu, a2, new abkh(abkl)));
            return;
        }
        abkl.a(2, 2);
    }
}
