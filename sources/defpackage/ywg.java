package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.data.internal.PlusImageView;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: ywg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywg extends iun implements yuv {
    private final PlusSession u;

    public ywg(Context context, ise ise, PlusSession plusSession, ica ica, icb icb) {
        super(context, ise, ica, icb);
        this.u = plusSession;
    }

    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalService");
        if (queryLocalInterface instanceof ytn) {
            return (ytn) queryLocalInterface;
        }
        return new ytl(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.plus.service.internal.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.plus.internal.IPlusInternalService";
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle a = this.u.a();
        a.putBoolean("skip_oob", false);
        String[] strArr = this.u.e;
        if (strArr != null) {
            a.putStringArray("required_features", strArr);
        }
        String str = this.u.h;
        if (str != null) {
            a.putString("application_name", str);
        }
        String str2 = this.u.g;
        if (str2 != null) {
            a.putString("com.google.android.gms.plus.internal.CALLING_PACKAGE_NAME", str2);
        }
        a.putString("auth_package", this.u.f);
        return a;
    }

    public final void b(ynp ynp, String str, int i, String str2) {
        w();
        yvm yvm = new yvm(this, ynp);
        try {
            ((ytn) x()).a(yvm, str, i, str2, (Uri) null, (String) null);
        } catch (RemoteException e) {
            yvm.a(8, (Bundle) null, (MomentsFeed) null);
        }
    }

    public final String a() {
        w();
        try {
            return ((ytn) x()).b();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void b(yum yum, int i, String str) {
        w();
        yve yve = new yve(this, yum);
        try {
            ((ytn) x()).a((ytk) yve, 0, i, str);
        } catch (RemoteException e) {
            yve.a(DataHolder.b(8), (String) null);
        }
    }

    public final void a(PlusImageView plusImageView, Uri uri, int i) {
        w();
        Bundle bundle = new Bundle();
        bundle.putInt("bounding_box", i);
        yvo yvo = new yvo(this, plusImageView);
        try {
            ((ytn) x()).a((ytk) yvo, uri, bundle);
        } catch (RemoteException e) {
            yvo.a(8, (Bundle) null, (ParcelFileDescriptor) null);
        }
    }

    public final void b(yup yup, String str) {
        w();
        yvs yvs = new yvs(this, yup);
        try {
            ((ytn) x()).b((ytk) yvs, str);
        } catch (RemoteException e) {
            yvs.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(ymu ymu, String str) {
        w();
        yvk yvk = new yvk(this, ymu);
        try {
            ((ytn) x()).e(yvk, str);
        } catch (RemoteException e) {
            yvk.a(8, (Bundle) null, str);
        }
    }

    public final void a(yne yne, String str, String str2, boolean z, String str3) {
        w();
        ywc ywc = new ywc(this, yne);
        try {
            ((ytn) x()).a((ytk) ywc, str, str2, z, str3);
        } catch (RemoteException e) {
            ywc.b(8, (Bundle) null);
        }
    }

    public final void a(ynp ynp, String str, int i, String str2) {
        w();
        yvm yvm = new yvm(this, ynp);
        try {
            ((ytn) x()).a((ytk) yvm, str, i, str2);
        } catch (RemoteException e) {
            yvm.a(8, (Bundle) null, (MomentsFeed) null);
        }
    }

    public final void a(yrm yrm, int i, int i2, String str) {
        w();
        yvq yvq = new yvq(this, yrm);
        try {
            ((ytn) x()).b(yvq, i, i2, str);
        } catch (RemoteException e) {
            yvq.a(8, (Bundle) null, (PeopleFeed) null);
        }
    }

    public final void a(yuj yuj, String str, Audience audience) {
        w();
        yuy yuy = new yuy(this, yuj);
        try {
            ((ytn) x()).a((ytk) yuy, str, audience);
        } catch (RemoteException e) {
            yuy.a(8, (Bundle) null);
        }
    }

    public final void a(yuk yuk, String str, ApplicationEntity applicationEntity) {
        w();
        yva yva = new yva(this, yuk);
        try {
            ((ytn) x()).a((ytk) yva, str, applicationEntity);
        } catch (RemoteException e) {
            yva.a(8, (Bundle) null, str, (AppAclsEntity) null);
        }
    }

    public final void a(yul yul, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        w();
        yul yul2 = yul;
        try {
            ((ytn) x()).a(new yvc(this, yul), str, applicationEntity, list, z, z2, z3, z4);
        } catch (RemoteException e) {
        }
    }

    public final void a(yum yum, int i, String str) {
        w();
        yve yve = new yve(this, yum);
        try {
            ((ytn) x()).a((ytk) yve, i, str);
        } catch (RemoteException e) {
            yve.a(DataHolder.b(8), (String) null);
        }
    }

    public final void a(yun yun, Comment comment) {
        w();
        yuw yuw = new yuw(this, yun);
        try {
            ((ytn) x()).a((ytk) yuw, comment);
        } catch (RemoteException e) {
            yuw.a(8, (Bundle) null, (Comment) null);
        }
    }

    public final void a(yuo yuo, String str) {
        w();
        yvi yvi = new yvi(this, yuo);
        try {
            ((ytn) x()).f(yvi, str);
        } catch (RemoteException e) {
            yvi.a(8, (Bundle) null, (List) null);
        }
    }

    public final void a(yup yup, String str) {
        w();
        yvs yvs = new yvs(this, yup);
        try {
            ((ytn) x()).a((ytk) yvs, str);
        } catch (RemoteException e) {
            yvs.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(yup yup, String str, String str2) {
        w();
        yvs yvs = new yvs(this, yup);
        try {
            ((ytn) x()).a((ytk) yvs, str, str2);
        } catch (RemoteException e) {
            yvs.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(yuq yuq, Post post) {
        w();
        yvu yvu = new yvu(this, yuq);
        try {
            ((ytn) x()).c((ytk) yvu, post);
        } catch (RemoteException e) {
            yvu.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(yur yur, Post post) {
        w();
        yvw yvw = new yvw(this, yur);
        try {
            ((ytn) x()).b((ytk) yvw, post);
        } catch (RemoteException e) {
            yvw.a(8, (Bundle) null, (Settings) null);
        }
    }

    public final void a(yus yus, Post post) {
        w();
        yvy yvy = new yvy(this, yus);
        try {
            ((ytn) x()).a((ytk) yvy, post);
        } catch (RemoteException e) {
            yvy.a(8, (Bundle) null, (Post) null);
        }
    }

    public final void a(yut yut) {
        w();
        ywa ywa = new ywa(this, yut);
        try {
            ((ytn) x()).a(ywa);
        } catch (RemoteException e) {
            ywa.a(8, (Bundle) null, (Bundle) null);
        }
    }

    public final void a(yuu yuu, String str, UpgradeAccountEntity upgradeAccountEntity) {
        w();
        ywe ywe = new ywe(this, yuu);
        try {
            ((ytn) x()).a((ytk) ywe, str, upgradeAccountEntity);
        } catch (RemoteException e) {
            ywe.a(8, (Bundle) null, (UpgradeAccountEntity) null);
        }
    }

    public final void a(zab zab, String str) {
        w();
        yvg yvg = new yvg(this, zab);
        try {
            ((ytn) x()).c((ytk) yvg, str);
        } catch (RemoteException e) {
            yvg.a(8, (Bundle) null, (Bundle) null);
        }
    }
}
