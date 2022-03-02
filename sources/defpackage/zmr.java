package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;

/* renamed from: zmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zmr extends Fragment implements yus, yur, yuq {
    private static final String[] E = {"https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/plus.stream.write", "https://www.googleapis.com/auth/plus.settings", "https://www.googleapis.com/auth/plus.pages.manage"};
    public static final Status a = new Status(8);
    public final icm A = new zmh(this);
    public final icm B = new zmi(this);
    public final icm C = new zmj(this);
    public final icm D = new zmk(this);
    private yui F = yuv.a;
    private final icm G = new zml(this);
    public yuv b;
    public zmp c;
    public icc d;
    public zmo e;
    public zmq f;
    public zms g;
    public String h;
    public String[] i;
    public String j;
    public int k;
    public boolean l;
    public Post m;
    public Settings n;
    public AddToCircleConsentData o;
    public ysw p;
    public String q;
    public Bitmap r;
    public boolean s;
    public String t;
    public boolean u;
    public String v;
    public Audience w;
    public final ArrayList x = new ArrayList();
    public long y = ((Long) ysu.X.c()).longValue();
    public final icm z = new zmg(this);

    public static zmr a(String str) {
        yui yui = yuv.a;
        Bundle bundle = new Bundle();
        bundle.putString("specified_account_name", str);
        zmr zmr = new zmr();
        zmr.F = yui;
        zmr.setArguments(bundle);
        return zmr;
    }

    public final void b() {
        Audience audience = this.w;
        ArrayList arrayList = new ArrayList();
        if (audience != null && !ixb.a(audience)) {
            int size = audience.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                AudienceMember audienceMember = (AudienceMember) audience.b.get(i2);
                if (audienceMember.b == 2) {
                    arrayList.add(audienceMember.e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (Log.isLoggable("ShareBox", 5)) {
                Log.w("ShareBox", "No people to add to circle");
            }
            a(a, (String) null, (String[]) null);
        } else if (this.d.i()) {
            ibq ibq = wlt.a;
            icc icc = this.d;
            icc.b((idf) new xcs(icc, this.j, this.g.b(), this.v, arrayList)).a(this.G);
        } else if (!this.d.j()) {
            this.d.e();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        int i2;
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.g = this.f.j();
            String callingPackage = this.f.getCallingPackage();
            this.h = callingPackage;
            this.i = jgu.a(jgu.d(activity, callingPackage));
            String a2 = zmf.a(activity, getArguments().getString("specified_account_name"), this.h, this.i);
            ywh ywh = new ywh(activity);
            ywh.c = this.h;
            ywh.f = this.f.i();
            ywh.a = a2;
            ywh.e = this.g.m;
            ywh.a(E);
            if (zmf.a(activity, this.g.f)) {
                ywh.d = new String[0];
            }
            if (this.b == null) {
                this.c = new zmp(this);
                yui yui = this.F;
                Context applicationContext = activity.getApplicationContext();
                PlusSession a3 = ywh.a();
                zmp zmp = this.c;
                yuv a4 = yui.a(applicationContext, a3, zmp, zmp);
                this.b = a4;
                a4.t();
            }
            if (this.d == null) {
                if (!hya.a((Context) getActivity()).b(this.h)) {
                    i2 = 100;
                } else {
                    i2 = 80;
                }
                String str = this.g.m;
                if (str != null) {
                    try {
                        i2 = Integer.parseInt(str);
                    } catch (NumberFormatException e2) {
                    }
                }
                this.e = new zmo(this);
                icc a5 = this.F.a(activity, i2, this.h);
                this.d = a5;
                a5.a((ica) this.e);
                this.d.a((icb) this.e);
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof zmq)) {
            String valueOf = String.valueOf(zmq.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.f = (zmq) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.b.l() || this.b.m()) {
            this.b.j();
        }
        this.b = null;
        if (this.d.i() || this.d.j()) {
            this.d.g();
        }
        this.d = null;
        this.j = null;
        this.k = -1;
    }

    public final void onDetach() {
        super.onDetach();
        this.f = null;
    }

    public final void a(ConnectionResult connectionResult, Post post) {
        zmq zmq;
        if (this.l && (zmq = this.f) != null) {
            zmq.a(connectionResult, post);
        }
        this.l = false;
    }

    public final void a(ConnectionResult connectionResult, Settings settings) {
        this.n = settings;
        zmq zmq = this.f;
        if (zmq != null) {
            zmq.a(connectionResult, settings);
        }
    }

    public final void a(ConnectionResult connectionResult, ysw ysw) {
        this.p = ysw;
        zmq zmq = this.f;
        if (zmq != null) {
            zmq.a(connectionResult, ysw);
        }
    }

    public final void a(Status status, AddToCircleConsentData addToCircleConsentData) {
        this.o = addToCircleConsentData;
        zmq zmq = this.f;
        if (zmq != null) {
            zmq.a(status);
        }
    }

    public final void a(Status status, String str, String[] strArr) {
        this.v = null;
        this.w = null;
        zmq zmq = this.f;
        if (zmq != null) {
            zmq.a(status, str, strArr);
        }
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        b(favaDiagnosticsEntity, iay.c);
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (a()) {
            izr.a(activity, this.j, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.h);
            return;
        }
        ArrayList arrayList = this.x;
        zmm zmm = new zmm();
        zmm.a = favaDiagnosticsEntity;
        zmm.b = favaDiagnosticsEntity2;
        arrayList.add(zmm.a());
    }

    public final void b(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (a()) {
            izr.a((Context) activity, this.j, this.f.j().b(), favaDiagnosticsEntity, favaDiagnosticsEntity2, this.h);
            return;
        }
        ArrayList arrayList = this.x;
        zmm zmm = new zmm();
        zmm.c = favaDiagnosticsEntity;
        zmm.a = favaDiagnosticsEntity2;
        arrayList.add(zmm.a());
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, ClientActionDataEntity clientActionDataEntity, ActionTargetEntity actionTargetEntity) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (a()) {
            izq izq = new izq((Context) activity);
            izq.a(this.j);
            izq.a(favaDiagnosticsEntity);
            if (favaDiagnosticsEntity2 == null) {
                favaDiagnosticsEntity2 = iay.c;
            }
            izq.c(favaDiagnosticsEntity2);
            izq.b(this.h);
            if (clientActionDataEntity != null) {
                izq.a(clientActionDataEntity);
            }
            if (actionTargetEntity != null) {
                izq.a(actionTargetEntity);
            }
            izr.a(activity, izq);
            return;
        }
        ArrayList arrayList = this.x;
        zmm zmm = new zmm();
        zmm.a = favaDiagnosticsEntity2;
        zmm.c = favaDiagnosticsEntity;
        zmm.d = clientActionDataEntity;
        zmm.e = actionTargetEntity;
        arrayList.add(zmm.a());
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.j);
    }
}
