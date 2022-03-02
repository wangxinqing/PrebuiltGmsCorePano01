package defpackage;

import android.os.SystemClock;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.ContactOptionsContainer;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ooh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ooh extends nzj {
    private final HelpChimeraActivity e;
    private final HelpConfig f;
    private final okc g;

    public ooh(HelpChimeraActivity helpChimeraActivity) {
        super(helpChimeraActivity);
        this.e = helpChimeraActivity;
        this.f = helpChimeraActivity.x;
        this.g = helpChimeraActivity.y;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i;
        int i2;
        avob avob = (avob) obj;
        HelpChimeraActivity helpChimeraActivity = this.e;
        ocr ocr = helpChimeraActivity.e;
        ooh x = helpChimeraActivity.x();
        long ax = axmj.a.a().ax();
        ocr.b = x;
        long uptimeMillis = SystemClock.uptimeMillis() + ax;
        ocr.a = uptimeMillis;
        ocr.postAtTime(ocr.d, uptimeMillis);
        if (avob != null) {
            aucd aucd = (aucd) avob.c(5);
            aucd.a((aucj) avob);
            nze nze = helpChimeraActivity.m;
            if (nze.a("should_contact_card_show_chat_available", false)) {
                int a = avod.a(((avob) aucd.b).b);
                if (a == 0) {
                    a = 1;
                }
                if (a == 3 || a == 4) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    avob avob2 = (avob) aucd.b;
                    avob2.b = 1;
                    avob2.a |= 1;
                }
                odu.h(nze);
            }
            helpChimeraActivity.x.k = (avob) aucd.i();
            ogs ogs = helpChimeraActivity.i;
            if (!ogs.c.E()) {
                ContactOptionsContainer h = ogs.h();
                if (h.b != null) {
                    if (h.f.m()) {
                        ocl ocl = h.b;
                        TextView b = ocl.b();
                        if (b != null) {
                            ocl.a(b, ocl.a.getResources().getString(R.string.gh_chat_contact_card_waiting));
                            if (ofy.b()) {
                                i = ofy.a(ocl.a.getContext(), R.attr.gh_primaryBlueColor);
                            } else {
                                i = kf.b(ocl.a.getContext(), R.color.material_blue_grey_500);
                            }
                            b.setTextColor(i);
                        }
                    } else if (!h.f.n()) {
                        h.b.a();
                    } else {
                        ocl ocl2 = h.b;
                        TextView b2 = ocl2.b();
                        if (b2 != null) {
                            ocl.a(b2, ocl2.a.getResources().getString(R.string.gh_contact_option_in_progress));
                            if (ofy.b()) {
                                i2 = ofy.a(ocl2.a.getContext(), R.attr.gh_primaryBlueColor);
                            } else {
                                i2 = kf.b(ocl2.a.getContext(), R.color.google_blue500);
                            }
                            b2.setTextColor(i2);
                        }
                    }
                }
            }
            HelpConfig helpConfig = helpChimeraActivity.x;
            if (helpConfig.l == 3 && !helpConfig.k()) {
                helpChimeraActivity.a(58, avmt.CHAT);
            }
        }
        if (helpChimeraActivity.u()) {
            helpChimeraActivity.v();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (jkf.a(this.e)) {
            return ocp.a(this.e, this.f, this.g);
        }
        return null;
    }
}
