package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.v2.model.BirthdayData;
import com.google.android.gms.family.v2.model.ProfileData;
import com.google.android.gms.people.protomodel.Birthday;
import com.google.android.gms.people.protomodel.Name;
import com.google.android.gms.people.protomodel.Person;
import com.google.android.gms.people.protomodel.Photo;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* renamed from: mly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mly extends mhh {
    private final String b;

    public mly(Context context, String str) {
        super(context);
        this.b = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Context context = getContext();
        if (mgm.a == null) {
            mgm.a = new xpo(new izd(context, axgd.a.a().q(), (int) axgd.a.a().r(), context.getApplicationInfo().uid, 6656));
        }
        xpo xpo = mgm.a;
        try {
            aqvo aqvo = (aqvo) aqvp.g.o();
            aqvo.a("me");
            if (aqvo.c) {
                aqvo.c();
                aqvo.c = false;
            }
            ((aqvp) aqvo.b).e = aqvn.a(4);
            if (axfo.a.a().d()) {
                aucd o = aqwp.d.o();
                aucd o2 = aqur.c.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                "GMS FAMILY PROFILE_LOADER".getClass();
                ((aqur) o2.b).a = "GMS FAMILY PROFILE_LOADER";
                String e = jhg.e((Context) ihs.b());
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                e.getClass();
                ((aqur) o2.b).b = e;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqur aqur = (aqur) o2.i();
                aqur.getClass();
                ((aqwp) o.b).a = aqur;
                if (aqvo.c) {
                    aqvo.c();
                    aqvo.c = false;
                }
                aqwp aqwp = (aqwp) o.i();
                aqwp.getClass();
                ((aqvp) aqvo.b).d = aqwp;
            }
            Context context2 = getContext();
            String str = this.b;
            ClientContext clientContext = new ClientContext();
            Account account = new Account(str, "com.google");
            clientContext.b = Process.myUid();
            clientContext.d = account;
            clientContext.c = account;
            clientContext.e = context2.getPackageName();
            clientContext.f = context2.getPackageName();
            clientContext.d("https://www.googleapis.com/auth/peopleapi.legacy.readwrite");
            aqvr a = xpo.a(clientContext, (aqvp) aqvo.i());
            if (a != null) {
                if (!(a.a.size() == 0 || ((aqwr) a.a.get(0)).a == null)) {
                    amgi amgi = ((aqwr) a.a.get(0)).a;
                    if (amgi == null) {
                        amgi = amgi.D;
                    }
                    Person a2 = ycq.a(amgi);
                    if (a2 == null) {
                        return new mhg(false, (Object) null);
                    }
                    ProfileData profileData = new ProfileData();
                    profileData.a = this.b;
                    if (a2.b() != null && !a2.b().isEmpty()) {
                        Name name = (Name) a2.b().get(0);
                        Iterator it = a2.b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Name name2 = (Name) it.next();
                            if (name2.a() != null && name2.a().b().booleanValue()) {
                                name = name2;
                                break;
                            }
                        }
                        if (name != null) {
                            profileData.b = name.b();
                            profileData.d = name.e();
                            profileData.c = name.d();
                        }
                    }
                    if (!(a2.f() == null || a2.f().isEmpty() || a2.f().get(0) == null)) {
                        Birthday birthday = (Birthday) a2.f().get(0);
                        Iterator it2 = a2.f().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Birthday birthday2 = (Birthday) it2.next();
                                if (birthday2.a() != null && birthday2.a().a() != null && birthday2.a().a().equals(0)) {
                                    birthday = birthday2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        Calendar instance = GregorianCalendar.getInstance();
                        instance.setTimeInMillis(birthday.b().longValue());
                        profileData.f = new BirthdayData();
                        profileData.f.a = instance.get(2);
                        profileData.f.b = instance.get(5);
                    }
                    if (!(a2.c() == null || a2.c().isEmpty() || a2.c().get(0) == null)) {
                        profileData.e = ((Photo) a2.c().get(0)).b();
                    }
                    return new mhg(true, profileData);
                }
            }
            return new mhg(false, (Object) null);
        } catch (babk | eif e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("People server call failed with error: ");
            sb.append(valueOf);
            mfv.e("ProfileDataLoader", sb.toString(), new Object[0]);
            return new mhg(false, (Object) null);
        }
    }
}
