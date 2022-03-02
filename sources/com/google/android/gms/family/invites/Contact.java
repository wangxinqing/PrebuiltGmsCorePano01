package com.google.android.gms.family.invites;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.people.model.AvatarReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Contact implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mgn();
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public AvatarReference g;
    public int h = 1;
    public Uri i;
    public int j;

    public Contact() {
    }

    public final boolean a() {
        return (this.a == null && this.c == null) ? false : true;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final int c() {
        return this.a != null ? 3 : 2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Contact) || this.d != ((Contact) obj).d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return jlh.a(this.a).hashCode() + jlh.a(this.c).hashCode() + jlh.a(this.b).hashCode();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[10];
        objArr[0] = this.b;
        objArr[1] = this.a;
        objArr[2] = this.c;
        objArr[3] = this.e;
        objArr[4] = Integer.valueOf(this.d);
        objArr[5] = this.f;
        objArr[6] = Integer.valueOf(this.j);
        AvatarReference avatarReference = this.g;
        String str2 = "";
        if (avatarReference != null) {
            str = avatarReference.toString();
        } else {
            str = str2;
        }
        objArr[7] = str;
        objArr[8] = Integer.valueOf(this.h);
        Uri uri = this.i;
        if (uri != null) {
            str2 = uri.toString();
        }
        objArr[9] = str2;
        return String.format("DisplayName:%s, PhoneNumber:%s, EmailAddress:%s, InvitationMessage:%s, contactId:%s invitationId:%s, state:%s, avatar:%s, numSmsParts:%s, avatarUri:%s", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.j);
        parcel.writeParcelable(this.g, i2);
        parcel.writeInt(this.h);
        parcel.writeParcelable(this.i, i2);
    }

    public Contact(Parcel parcel) {
        this.b = parcel.readString();
        this.a = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.j = parcel.readInt();
        this.g = (AvatarReference) parcel.readParcelable(AvatarReference.class.getClassLoader());
        this.h = parcel.readInt();
        this.i = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public Contact(Contact contact) {
        this.b = contact.b;
        this.a = contact.a;
        this.j = contact.j;
        this.c = contact.c;
        this.e = contact.e;
        this.f = contact.f;
        this.d = contact.d;
        this.g = contact.g;
        this.i = contact.i;
    }
}
