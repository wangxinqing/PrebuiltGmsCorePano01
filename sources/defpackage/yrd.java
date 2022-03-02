package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrd extends Fragment implements ica, icb {
    public icc a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public boolean e;
    public Status f;
    public ArrayList g;
    public ArrayList h;
    private final yui i = yuv.a;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private final icm o = new yrb(this);

    private static final ArrayList a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((AudienceMember) arrayList.get(i2)).d);
        }
        return arrayList2;
    }

    public final void g(Bundle bundle) {
        if (this.d) {
            this.d = false;
            a();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof yrc)) {
            throw new IllegalStateException("Activity must implement UpdateCirclesFragmentHost.");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        this.j = arguments.getString("accountName");
        this.k = arguments.getString("plusPageId");
        this.l = arguments.getString("updatePersonId");
        this.b = arguments.getParcelableArrayList("circleIdsToAdd");
        this.c = arguments.getParcelableArrayList("circleIdsToRemove");
        this.m = arguments.getString("callingPackageName");
        String string = arguments.getString("clientApplicationId");
        this.n = string;
        if (this.a == null) {
            int i2 = 0;
            if (!TextUtils.isEmpty(string)) {
                try {
                    i2 = Integer.parseInt(this.n);
                } catch (NumberFormatException e2) {
                }
            }
            icc a2 = this.i.a(getActivity().getApplicationContext(), i2, this.m);
            this.a = a2;
            a2.a((ica) this);
            this.a.a((icb) this);
        }
        this.a.e();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.g();
    }

    public final void b() {
        yrc yrc = (yrc) getActivity();
        if (yrc != null) {
            yrc.a(this.f, this.g, this.h);
        }
    }

    public static ArrayList a(ArrayList arrayList, List list) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        if (list != null) {
            for (int i2 = 0; i2 < size; i2++) {
                AudienceMember audienceMember = (AudienceMember) arrayList.get(i2);
                if (list.contains(audienceMember.d)) {
                    arrayList2.add(audienceMember);
                }
            }
        }
        return arrayList2;
    }

    public final void a() {
        this.e = true;
        ibq ibq = wlt.a;
        xcy.a(this.a, this.j, this.k, this.l, a(this.b), a(this.c), ylq.a).a(this.o);
    }

    public final void a(int i2) {
        if (this.d || this.e) {
            this.d = true;
            this.a.e();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.f = Status.c;
        b();
    }
}
