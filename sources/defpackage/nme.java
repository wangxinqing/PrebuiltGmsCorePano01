package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.PopupLocationInfoParcelable;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nme extends isy {
    public boolean a = false;
    private final nmn u = new nmn();
    private final String v;
    private final nml w;
    private boolean x = false;
    private final long y;
    private final nli z;

    public static void a(RemoteException remoteException) {
        nmf.a("GamesGmsClientImpl", "service died", remoteException);
    }

    /* access modifiers changed from: package-private */
    public final void A() {
        if (l()) {
            try {
                nmi nmi = (nmi) x();
                nmi.b(5006, nmi.aQ());
            } catch (RemoteException e) {
                a(e);
            }
        }
    }

    public final Bundle C() {
        try {
            nmi nmi = (nmi) x();
            Parcel a2 = nmi.a(5004, nmi.aQ());
            Bundle bundle = (Bundle) bhx.a(a2, Bundle.CREATOR);
            a2.recycle();
            if (bundle != null) {
                bundle.setClassLoader(nme.class.getClassLoader());
            }
            return bundle;
        } catch (RemoteException e) {
            a(e);
            return null;
        }
    }

    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.games.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        String locale = this.c.getResources().getConfiguration().locale.toString();
        nli nli = this.z;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", nli.a);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", nli.b);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", nli.c);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", nli.d);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", nli.e);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", nli.f);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", nli.g);
        bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", nli.h);
        bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", nli.i);
        bundle.putParcelable("com.google.android.gms.games.key.googleSignInAccount", nli.j);
        bundle.putString("com.google.android.gms.games.key.realClientPackageName", nli.k);
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", nli.m);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", this.v);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", locale);
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.w.b.a));
        if (!bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            bundle.putInt("com.google.android.gms.games.key.API_VERSION", 7);
        }
        bundle.putBundle("com.google.android.gms.games.key.signInOptions", abdy.a(this.s));
        return bundle;
    }

    public final boolean g() {
        nli nli = this.z;
        return nli.k == null && !nli.h;
    }

    public final void j() {
        this.x = false;
        if (l()) {
            try {
                this.u.a();
                nmi nmi = (nmi) x();
                long j = this.y;
                Parcel aQ = nmi.aQ();
                aQ.writeLong(j);
                nmi.b(5001, aQ);
            } catch (RemoteException e) {
                nmf.b("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.j();
    }

    public final Set q() {
        return this.t;
    }

    public nme(Context context, Looper looper, ise ise, nli nli, ica ica, icb icb) {
        super(context, looper, 1, ise, ica, icb);
        this.v = ise.e;
        new Binder();
        this.w = new nml(this);
        this.y = (long) hashCode();
        this.z = nli;
        if (!nli.h && (context instanceof Activity)) {
            nml nml = this.w;
            nml.a.A();
            WeakReference weakReference = nml.c;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                Context context2 = nml.a.c;
                if (view == null && (context2 instanceof Activity)) {
                    view = ((Activity) context2).getWindow().getDecorView();
                }
                if (view != null) {
                    view.removeOnAttachStateChangeListener(nml);
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    int i = Build.VERSION.SDK_INT;
                    viewTreeObserver.removeOnGlobalLayoutListener(nml);
                }
            }
            View view2 = null;
            nml.c = null;
            Context context3 = nml.a.c;
            if (context3 instanceof Activity) {
                Activity activity = (Activity) context3;
                view2 = activity.findViewById(16908290);
                view2 = view2 == null ? activity.getWindow().getDecorView() : view2;
                nmf.b("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
            }
            if (view2 != null) {
                nml.a(view2);
                nml.c = new WeakReference(view2);
                view2.addOnAttachStateChangeListener(nml);
                view2.getViewTreeObserver().addOnGlobalLayoutListener(nml);
                return;
            }
            nmf.c("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        if (queryLocalInterface instanceof nmi) {
            return (nmi) queryLocalInterface;
        }
        return new nmi(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Set a(Set set) {
        boolean z2;
        HashSet hashSet = new HashSet(set);
        boolean contains = set.contains(nlj.a);
        boolean contains2 = set.contains(nlj.b);
        if (set.contains(nlj.d)) {
            iva.a(!contains, "Cannot have both %s and %s!", "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty");
        } else {
            if (contains) {
                z2 = true;
            } else {
                z2 = contains2;
            }
            iva.a(z2, "Games APIs requires %s function.", "https://www.googleapis.com/auth/games_lite");
            if (contains2 && contains) {
                hashSet.remove(nlj.b);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            bundle.setClassLoader(nme.class.getClassLoader());
            boolean z2 = bundle.getBoolean("show_welcome_popup");
            this.x = z2;
            this.a = z2;
            PlayerEntity playerEntity = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            GameEntity gameEntity = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.a(i, iBinder, bundle, i2);
    }

    public final /* bridge */ /* synthetic */ void a(IInterface iInterface) {
        nmi nmi = (nmi) iInterface;
        super.a((IInterface) nmi);
        if (this.x) {
            this.w.a();
            this.x = false;
        }
        nli nli = this.z;
        if (!nli.a && !nli.h) {
            try {
                nmc nmc = new nmc(new PopupLocationInfoParcelable(this.w.b));
                long j = this.y;
                Parcel aQ = nmi.aQ();
                bhx.a(aQ, (IInterface) nmc);
                aQ.writeLong(j);
                nmi.b(15501, aQ);
            } catch (RemoteException e) {
                a(e);
            }
        }
    }

    public final void a(ConnectionResult connectionResult) {
        super.a(connectionResult);
        this.x = false;
    }

    public final void a(ifi ifi) {
        try {
            nmd nmd = new nmd(ifi);
            this.u.a();
            try {
                nmi nmi = (nmi) x();
                nmb nmb = new nmb(nmd);
                Parcel aQ = nmi.aQ();
                bhx.a(aQ, (IInterface) nmb);
                nmi.b(5002, aQ);
            } catch (SecurityException e) {
                nmd.a(new Status(4, ibt.a(4)));
            }
        } catch (RemoteException e2) {
            ifi.a();
        }
    }
}
