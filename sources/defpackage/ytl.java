package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: ytl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ytl extends bhv implements ytn {
    public ytl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusInternalService");
    }

    public final void a(String str, String str2) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        b(9, aQ);
    }

    public final String b() {
        Parcel a = a(4, aQ());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void c(ytk ytk, Post post) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        bhx.a(aQ, (Parcelable) post);
        b(23, aQ);
    }

    public final void d(ytk ytk, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        b(8, aQ);
    }

    public final void e(ytk ytk, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        b(25, aQ);
    }

    public final void f(ytk ytk, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        b(26, aQ);
    }

    public final void a(ytk ytk) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        b(6, aQ);
    }

    public final void b(ytk ytk, int i, int i2, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        aQ.writeString(str);
        b(31, aQ);
    }

    public final void c(ytk ytk, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        b(5, aQ);
    }

    public final void a(ytk ytk, int i, int i2, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeInt(0);
        aQ.writeInt(i2);
        aQ.writeString(str);
        b(29, aQ);
    }

    public final void b(ytk ytk, Post post) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        bhx.a(aQ, (Parcelable) post);
        b(22, aQ);
    }

    public final void a(ytk ytk, int i, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeInt(i);
        aQ.writeString(str);
        b(11, aQ);
    }

    public final void b(ytk ytk, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        b(3, aQ);
    }

    public final void a(ytk ytk, Uri uri, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        bhx.a(aQ, (Parcelable) uri);
        bhx.a(aQ, (Parcelable) bundle);
        b(7, aQ);
    }

    public final void a(ytk ytk, Comment comment) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        bhx.a(aQ, (Parcelable) comment);
        b(20, aQ);
    }

    public final void a(ytk ytk, Post post) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        bhx.a(aQ, (Parcelable) post);
        b(21, aQ);
    }

    public final void a(ytk ytk, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        b(1, aQ);
    }

    public final void a(ytk ytk, String str, int i, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        aQ.writeInt(i);
        aQ.writeString(str2);
        b(27, aQ);
    }

    public final void a(ytk ytk, String str, int i, String str2, Uri uri, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        aQ.writeInt(i);
        aQ.writeString(str2);
        bhx.a(aQ, (Parcelable) null);
        aQ.writeString((String) null);
        b(24, aQ);
    }

    public final void a(ytk ytk, String str, Audience audience) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) audience);
        b(18, aQ);
    }

    public final void a(ytk ytk, String str, ApplicationEntity applicationEntity) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) applicationEntity);
        b(14, aQ);
    }

    public final void a(ytk ytk, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) applicationEntity);
        aQ.writeTypedList(list);
        bhx.a(aQ, z);
        bhx.a(aQ, z2);
        bhx.a(aQ, z3);
        bhx.a(aQ, z4);
        b(19, aQ);
    }

    public final void a(ytk ytk, String str, UpgradeAccountEntity upgradeAccountEntity) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) upgradeAccountEntity);
        b(30, aQ);
    }

    public final void a(ytk ytk, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(2, aQ);
    }

    public final void a(ytk ytk, String str, String str2, int i, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeInt(i);
        aQ.writeString(str3);
        b(10, aQ);
    }

    public final void a(ytk ytk, String str, String str2, boolean z, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ytk);
        aQ.writeString(str);
        aQ.writeString(str2);
        bhx.a(aQ, z);
        aQ.writeString(str3);
        b(28, aQ);
    }
}
