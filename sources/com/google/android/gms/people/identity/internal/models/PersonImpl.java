package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.identity.models.ImageReference;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PersonImpl extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator CREATOR = new wyw();
    public String A;
    List B;
    List C;
    List D;
    List E;
    public SortKeysImpl F;
    List G;
    List H;
    List I;
    final Set a;
    List b;
    List c;
    String d;
    List e;
    List f;
    List g;
    List h;
    public List i;
    public String j;
    List k;
    List l;
    public String m;
    public List n;
    List o;
    public String p;
    public LegacyFieldsImpl q;
    List r;
    public List s;
    public PersonMetadataImpl t;
    public List u;
    List v;
    List w;
    List x;
    public List y;
    List z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class AboutsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wya();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;

        public AboutsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public AboutsImpl(AboutsImpl aboutsImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = aboutsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = aboutsImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = aboutsImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public AboutsImpl(Set set, MetadataImpl metadataImpl, String str, String str2) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class AddressesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyb();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;

        public AddressesImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public AddressesImpl(AddressesImpl addressesImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = addressesImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = addressesImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = addressesImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
            this.e = null;
            String str3 = addressesImpl.e;
            if (str3 != null) {
                this.e = str3;
            }
            this.f = null;
            String str4 = addressesImpl.f;
            if (str4 != null) {
                this.f = str4;
            }
            this.g = null;
            String str5 = addressesImpl.g;
            if (str5 != null) {
                this.g = str5;
            }
            this.h = null;
            String str6 = addressesImpl.h;
            if (str6 != null) {
                this.h = str6;
            }
            this.i = null;
            String str7 = addressesImpl.i;
            if (str7 != null) {
                this.i = str7;
            }
            this.j = null;
            String str8 = addressesImpl.j;
            if (str8 != null) {
                this.j = str8;
            }
            this.k = null;
            String str9 = addressesImpl.k;
            if (str9 != null) {
                this.k = str9;
            }
            this.l = null;
            String str10 = addressesImpl.l;
            if (str10 != null) {
                this.l = str10;
            }
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i2, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.h, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.i, true);
            }
            if (set.contains(10)) {
                ivx.a(parcel, 10, this.j, true);
            }
            if (set.contains(11)) {
                ivx.a(parcel, 11, this.k, true);
            }
            if (set.contains(12)) {
                ivx.a(parcel, 12, this.l, true);
            }
            ivx.b(parcel, a2);
        }

        public AddressesImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = str8;
            this.k = str9;
            this.l = str10;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BirthdaysImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyc();
        final Set a;
        public MetadataImpl b;
        public String c;

        public BirthdaysImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public BirthdaysImpl(BirthdaysImpl birthdaysImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = birthdaysImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = birthdaysImpl.c;
            if (str != null) {
                this.c = str;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public BirthdaysImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BraggingRightsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyd();
        final Set a;
        public MetadataImpl b;
        public String c;

        public BraggingRightsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public BraggingRightsImpl(BraggingRightsImpl braggingRightsImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = braggingRightsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = braggingRightsImpl.c;
            if (str != null) {
                this.c = str;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public BraggingRightsImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class CoverPhotosImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new wye();
        final Set a;
        int b;
        public String c;
        public ImageReferenceImpl d;
        int e;
        boolean f;

        public CoverPhotosImpl() {
            this.a = new HashSet();
        }

        public final void a(int i) {
            this.a.add(2);
            this.b = i;
        }

        public final void b(int i) {
            this.a.add(5);
            this.e = i;
        }

        public CoverPhotosImpl(CoverPhotosImpl coverPhotosImpl) {
            this();
            this.a.remove(2);
            if (coverPhotosImpl.a.contains(2)) {
                a(coverPhotosImpl.b);
            }
            this.c = null;
            String str = coverPhotosImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            ImageReferenceImpl imageReferenceImpl = coverPhotosImpl.d;
            if (imageReferenceImpl != null) {
                this.d = new ImageReferenceImpl(imageReferenceImpl);
            }
            this.a.remove(5);
            if (coverPhotosImpl.a.contains(5)) {
                b(coverPhotosImpl.e);
            }
            this.a.remove(6);
            if (coverPhotosImpl.a.contains(6)) {
                a(coverPhotosImpl.f);
            }
        }

        public final void a(boolean z) {
            this.a.add(6);
            this.f = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.b(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, i, true);
            }
            if (set.contains(5)) {
                ivx.b(parcel, 5, this.e);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.f);
            }
            ivx.b(parcel, a2);
        }

        public CoverPhotosImpl(Set set, int i, String str, ImageReferenceImpl imageReferenceImpl, int i2, boolean z) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = imageReferenceImpl;
            this.e = i2;
            this.f = z;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class CustomFieldsImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new wyf();
        final Set a;
        public String b;
        public String c;

        public CustomFieldsImpl() {
            this.a = new HashSet();
        }

        public CustomFieldsImpl(CustomFieldsImpl customFieldsImpl) {
            this();
            this.b = null;
            String str = customFieldsImpl.b;
            if (str != null) {
                this.b = str;
            }
            this.c = null;
            String str2 = customFieldsImpl.c;
            if (str2 != null) {
                this.c = str2;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public CustomFieldsImpl(Set set, String str, String str2) {
            this.a = set;
            this.b = str;
            this.c = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class EmailsImpl extends AbstractSafeParcelable implements Person.Emails {
        public static final Parcelable.Creator CREATOR = new wyi();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;
        int f;

        public EmailsImpl() {
            this.a = new HashSet();
        }

        public final void a(int i) {
            this.a.add(6);
            this.f = i;
        }

        public final boolean a() {
            return this.b != null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            return this.b;
        }

        public final boolean d() {
            return this.c != null;
        }

        public final String e() {
            return this.c;
        }

        public final boolean f() {
            return this.d != null;
        }

        public final String g() {
            return this.d;
        }

        public final boolean h() {
            return this.e != null;
        }

        public final String i() {
            return this.e;
        }

        public final boolean j() {
            return this.a.contains(6);
        }

        public final int k() {
            return this.f;
        }

        public EmailsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, int i) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.b(parcel, 6, this.f);
            }
            ivx.b(parcel, a2);
        }

        public EmailsImpl(wzj wzj) {
            this();
            this.b = null;
            if (wzj.a()) {
                this.b = new MetadataImpl(wzj.c());
            }
            this.c = null;
            if (wzj.d()) {
                this.c = wzj.e();
            }
            this.d = null;
            if (wzj.f()) {
                this.d = wzj.g();
            }
            this.e = null;
            if (wzj.h()) {
                this.e = wzj.i();
            }
            this.a.remove(6);
            if (wzj.j()) {
                a(wzj.k());
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class EventsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyj();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;

        public EventsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public EventsImpl(EventsImpl eventsImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = eventsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = eventsImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = eventsImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
            this.e = null;
            String str3 = eventsImpl.e;
            if (str3 != null) {
                this.e = str3;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        public EventsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class GendersImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyk();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;

        public GendersImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public GendersImpl(GendersImpl gendersImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = gendersImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = gendersImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = gendersImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public GendersImpl(Set set, MetadataImpl metadataImpl, String str, String str2) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ImagesImpl extends AbstractSafeParcelable implements Person.Images {
        public static final Parcelable.Creator CREATOR = new wym();
        final Set a;
        public MetadataImpl b;
        public ImageReferenceImpl c;
        boolean d;

        public ImagesImpl() {
            this.a = new HashSet();
        }

        public final void a(boolean z) {
            this.a.add(4);
            this.d = z;
        }

        public final boolean a() {
            return this.b != null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            return this.b;
        }

        public final boolean d() {
            return this.c != null;
        }

        public final boolean e() {
            return this.a.contains(4);
        }

        public final boolean f() {
            return this.d;
        }

        public final /* bridge */ /* synthetic */ ImageReference g() {
            return this.c;
        }

        public final /* bridge */ /* synthetic */ wzi h() {
            return this.c;
        }

        public ImagesImpl(Set set, MetadataImpl metadataImpl, ImageReferenceImpl imageReferenceImpl, boolean z) {
            this.a = set;
            this.b = metadataImpl;
            this.c = imageReferenceImpl;
            this.d = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d);
            }
            ivx.b(parcel, a2);
        }

        public ImagesImpl(wzk wzk) {
            this();
            this.b = null;
            if (wzk.a()) {
                this.b = new MetadataImpl(wzk.c());
            }
            this.c = null;
            if (wzk.d()) {
                this.c = new ImageReferenceImpl(wzk.h());
            }
            this.a.remove(4);
            if (wzk.e()) {
                a(wzk.f());
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class InstantMessagingImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyn();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public InstantMessagingImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public InstantMessagingImpl(InstantMessagingImpl instantMessagingImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = instantMessagingImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = instantMessagingImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = instantMessagingImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
            this.e = null;
            String str3 = instantMessagingImpl.e;
            if (str3 != null) {
                this.e = str3;
            }
            this.f = null;
            String str4 = instantMessagingImpl.f;
            if (str4 != null) {
                this.f = str4;
            }
            this.g = null;
            String str5 = instantMessagingImpl.g;
            if (str5 != null) {
                this.g = str5;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.g, true);
            }
            ivx.b(parcel, a2);
        }

        public InstantMessagingImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, String str4, String str5) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class LegacyFieldsImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new wyo();
        final Set a;
        public String b;

        public LegacyFieldsImpl() {
            this.a = new HashSet();
        }

        public LegacyFieldsImpl(LegacyFieldsImpl legacyFieldsImpl) {
            this();
            this.b = null;
            String str = legacyFieldsImpl.b;
            if (str != null) {
                this.b = str;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            if (this.a.contains(2)) {
                ivx.a(parcel, 2, this.b, true);
            }
            ivx.b(parcel, a2);
        }

        public LegacyFieldsImpl(Set set, String str) {
            this.a = set;
            this.b = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class MembershipsImpl extends AbstractSafeParcelable implements Person.Memberships {
        public static final Parcelable.Creator CREATOR = new wyp();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;

        public MembershipsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            return this.b != null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            return this.b;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            return this.b;
        }

        public final boolean d() {
            return this.c != null;
        }

        public final String e() {
            return this.c;
        }

        public final boolean f() {
            return this.d != null;
        }

        public final String g() {
            return this.d;
        }

        public final boolean h() {
            return this.e != null;
        }

        public final String i() {
            return this.e;
        }

        public MembershipsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        public MembershipsImpl(wzl wzl) {
            this();
            this.b = null;
            if (wzl.a()) {
                this.b = new MetadataImpl(wzl.c());
            }
            this.c = null;
            if (wzl.d()) {
                this.c = wzl.e();
            }
            this.d = null;
            if (wzl.f()) {
                this.d = wzl.g();
            }
            this.e = null;
            if (wzl.h()) {
                this.e = wzl.i();
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class MetadataImpl extends AbstractSafeParcelable implements Person.Metadata {
        public static final Parcelable.Creator CREATOR = new wyq();
        final Set a;
        public String b;
        public String c;
        public String d;
        String e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        int j;

        public MetadataImpl() {
            this.a = new HashSet();
        }

        public final void a(int i2) {
            this.a.add(10);
            this.j = i2;
        }

        public final boolean a() {
            return this.b != null;
        }

        public final String b() {
            return this.b;
        }

        public final void c(boolean z) {
            this.a.add(9);
            this.i = z;
        }

        public final boolean c() {
            return this.c != null;
        }

        public final String d() {
            return this.c;
        }

        public final boolean e() {
            return this.d != null;
        }

        public final String f() {
            return this.d;
        }

        public final boolean g() {
            return this.e != null;
        }

        public final String h() {
            return this.e;
        }

        public final boolean i() {
            return this.a.contains(6);
        }

        public final boolean j() {
            return this.f;
        }

        public final boolean k() {
            return this.a.contains(7);
        }

        public final boolean l() {
            return this.g;
        }

        public final boolean m() {
            return this.a.contains(8);
        }

        public final boolean n() {
            return this.h;
        }

        public final boolean o() {
            return this.a.contains(9);
        }

        public final boolean p() {
            return this.i;
        }

        public final boolean q() {
            return this.a.contains(10);
        }

        public final int r() {
            return this.j;
        }

        public MetadataImpl(Set set, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
            this.j = i2;
        }

        public final void a(boolean z) {
            this.a.add(7);
            this.g = z;
        }

        public final void b(boolean z) {
            this.a.add(8);
            this.h = z;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.f);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.g);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.h);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.i);
            }
            if (set.contains(10)) {
                ivx.b(parcel, 10, this.j);
            }
            ivx.b(parcel, a2);
        }

        public MetadataImpl(wzm wzm) {
            this();
            this.b = null;
            if (wzm.a()) {
                this.b = wzm.b();
            }
            this.c = null;
            if (wzm.c()) {
                this.c = wzm.d();
            }
            this.d = null;
            if (wzm.e()) {
                this.d = wzm.f();
            }
            this.e = null;
            if (wzm.g()) {
                this.e = wzm.h();
            }
            this.a.remove(6);
            if (wzm.i()) {
                boolean j2 = wzm.j();
                this.a.add(6);
                this.f = j2;
            }
            this.a.remove(7);
            if (wzm.k()) {
                a(wzm.l());
            }
            this.a.remove(8);
            if (wzm.m()) {
                b(wzm.n());
            }
            this.a.remove(9);
            if (wzm.o()) {
                c(wzm.p());
            }
            this.a.remove(10);
            if (wzm.q()) {
                a(wzm.r());
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class NamesImpl extends AbstractSafeParcelable implements Person.Names {
        public static final Parcelable.Creator CREATOR = new wyr();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;

        public NamesImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            return this.b != null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            return this.b;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            return this.b;
        }

        public final boolean d() {
            return this.c != null;
        }

        public final String e() {
            return this.c;
        }

        public final boolean f() {
            return this.d != null;
        }

        public final String g() {
            return this.d;
        }

        public final boolean h() {
            return this.e != null;
        }

        public final String i() {
            return this.e;
        }

        public final boolean j() {
            return this.f != null;
        }

        public final String k() {
            return this.f;
        }

        public final boolean l() {
            return this.g != null;
        }

        public final String m() {
            return this.g;
        }

        public final boolean n() {
            return this.h != null;
        }

        public final String o() {
            return this.h;
        }

        public final boolean p() {
            return this.i != null;
        }

        public final String q() {
            return this.i;
        }

        public final boolean r() {
            return this.j != null;
        }

        public final String s() {
            return this.j;
        }

        public final boolean t() {
            return this.k != null;
        }

        public final String u() {
            return this.k;
        }

        public final boolean v() {
            return this.l != null;
        }

        public final String w() {
            return this.l;
        }

        public final boolean x() {
            return this.m != null;
        }

        public final String y() {
            return this.m;
        }

        public NamesImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = str8;
            this.k = str9;
            this.l = str10;
            this.m = str11;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i2, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.h, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.i, true);
            }
            if (set.contains(10)) {
                ivx.a(parcel, 10, this.j, true);
            }
            if (set.contains(11)) {
                ivx.a(parcel, 11, this.k, true);
            }
            if (set.contains(12)) {
                ivx.a(parcel, 12, this.l, true);
            }
            if (set.contains(13)) {
                ivx.a(parcel, 13, this.m, true);
            }
            ivx.b(parcel, a2);
        }

        public NamesImpl(wzo wzo) {
            this();
            this.b = null;
            if (wzo.a()) {
                this.b = new MetadataImpl(wzo.c());
            }
            this.c = null;
            if (wzo.d()) {
                this.c = wzo.e();
            }
            this.d = null;
            if (wzo.f()) {
                this.d = wzo.g();
            }
            this.e = null;
            if (wzo.h()) {
                this.e = wzo.i();
            }
            this.f = null;
            if (wzo.j()) {
                this.f = wzo.k();
            }
            this.g = null;
            if (wzo.l()) {
                this.g = wzo.m();
            }
            this.h = null;
            if (wzo.n()) {
                this.h = wzo.o();
            }
            this.i = null;
            if (wzo.p()) {
                this.i = wzo.q();
            }
            this.j = null;
            if (wzo.r()) {
                this.j = wzo.s();
            }
            this.k = null;
            if (wzo.t()) {
                this.k = wzo.u();
            }
            this.l = null;
            if (wzo.v()) {
                this.l = wzo.w();
            }
            this.m = null;
            if (wzo.x()) {
                this.m = wzo.y();
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class NicknamesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wys();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;

        public NicknamesImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public NicknamesImpl(NicknamesImpl nicknamesImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = nicknamesImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = nicknamesImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = nicknamesImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public NicknamesImpl(Set set, MetadataImpl metadataImpl, String str, String str2) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class NotesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyt();
        final Set a;
        public MetadataImpl b;
        public String c;

        public NotesImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public NotesImpl(NotesImpl notesImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = notesImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = notesImpl.c;
            if (str != null) {
                this.c = str;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public NotesImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class OccupationsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyu();
        final Set a;
        public MetadataImpl b;
        public String c;

        public OccupationsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public OccupationsImpl(OccupationsImpl occupationsImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = occupationsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = occupationsImpl.c;
            if (str != null) {
                this.c = str;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public OccupationsImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class OrganizationsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyv();
        final Set a;
        public MetadataImpl b;
        boolean c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;

        public OrganizationsImpl() {
            this.a = new HashSet();
        }

        public final void a(boolean z) {
            this.a.add(3);
            this.c = z;
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public OrganizationsImpl(OrganizationsImpl organizationsImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = organizationsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.a.remove(3);
            if (organizationsImpl.a.contains(3)) {
                a(organizationsImpl.c);
            }
            this.d = null;
            String str = organizationsImpl.d;
            if (str != null) {
                this.d = str;
            }
            this.e = null;
            String str2 = organizationsImpl.e;
            if (str2 != null) {
                this.e = str2;
            }
            this.f = null;
            String str3 = organizationsImpl.f;
            if (str3 != null) {
                this.f = str3;
            }
            this.g = null;
            String str4 = organizationsImpl.g;
            if (str4 != null) {
                this.g = str4;
            }
            this.h = null;
            String str5 = organizationsImpl.h;
            if (str5 != null) {
                this.h = str5;
            }
            this.i = null;
            String str6 = organizationsImpl.i;
            if (str6 != null) {
                this.i = str6;
            }
            this.j = null;
            String str7 = organizationsImpl.j;
            if (str7 != null) {
                this.j = str7;
            }
            this.k = null;
            String str8 = organizationsImpl.k;
            if (str8 != null) {
                this.k = str8;
            }
            this.l = null;
            String str9 = organizationsImpl.l;
            if (str9 != null) {
                this.l = str9;
            }
            this.m = null;
            String str10 = organizationsImpl.m;
            if (str10 != null) {
                this.m = str10;
            }
            this.n = null;
            String str11 = organizationsImpl.n;
            if (str11 != null) {
                this.n = str11;
            }
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i2, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.a(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.h, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.i, true);
            }
            if (set.contains(10)) {
                ivx.a(parcel, 10, this.j, true);
            }
            if (set.contains(11)) {
                ivx.a(parcel, 11, this.k, true);
            }
            if (set.contains(12)) {
                ivx.a(parcel, 12, this.l, true);
            }
            if (set.contains(13)) {
                ivx.a(parcel, 13, this.m, true);
            }
            if (set.contains(14)) {
                ivx.a(parcel, 14, this.n, true);
            }
            ivx.b(parcel, a2);
        }

        public OrganizationsImpl(Set set, MetadataImpl metadataImpl, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.a = set;
            this.b = metadataImpl;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = str7;
            this.k = str8;
            this.l = str9;
            this.m = str10;
            this.n = str11;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class PersonMetadataImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new wyx();
        final Set a;
        List b;
        List c;
        List d;
        List e;
        List f;
        List g;
        public String h;
        public String i;
        List j;
        public String k;
        public ProfileOwnerStatsImpl l;
        boolean m;
        boolean n;
        boolean o;

        public PersonMetadataImpl() {
            this.a = new HashSet();
        }

        public final List a() {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            return this.d;
        }

        public final void b(Collection collection) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.addAll(collection);
        }

        public final void c(Collection collection) {
            a().addAll(collection);
        }

        public final void d(Collection collection) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.addAll(collection);
        }

        public final void e(Collection collection) {
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.f.addAll(collection);
        }

        public final void f(Collection collection) {
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.addAll(collection);
        }

        public final void g(Collection collection) {
            if (this.j == null) {
                this.j = new ArrayList();
            }
            this.j.addAll(collection);
        }

        public PersonMetadataImpl(PersonMetadataImpl personMetadataImpl) {
            this();
            this.b = null;
            List list = personMetadataImpl.b;
            if (list != null) {
                a((Collection) list);
            }
            this.c = null;
            List list2 = personMetadataImpl.c;
            if (list2 != null) {
                b((Collection) list2);
            }
            this.d = null;
            List list3 = personMetadataImpl.d;
            if (list3 != null) {
                c((Collection) list3);
            }
            this.e = null;
            List list4 = personMetadataImpl.e;
            if (list4 != null) {
                d(list4);
            }
            this.f = null;
            List list5 = personMetadataImpl.f;
            if (list5 != null) {
                e(list5);
            }
            this.g = null;
            List list6 = personMetadataImpl.g;
            if (list6 != null) {
                f(list6);
            }
            this.h = null;
            String str = personMetadataImpl.h;
            if (str != null) {
                this.h = str;
            }
            this.i = null;
            String str2 = personMetadataImpl.i;
            if (str2 != null) {
                this.i = str2;
            }
            this.j = null;
            List list7 = personMetadataImpl.j;
            if (list7 != null) {
                g(list7);
            }
            this.k = null;
            String str3 = personMetadataImpl.k;
            if (str3 != null) {
                this.k = str3;
            }
            this.l = null;
            ProfileOwnerStatsImpl profileOwnerStatsImpl = personMetadataImpl.l;
            if (profileOwnerStatsImpl != null) {
                this.l = new ProfileOwnerStatsImpl(profileOwnerStatsImpl);
            }
            this.a.remove(13);
            if (personMetadataImpl.a.contains(13)) {
                a(personMetadataImpl.m);
            }
            this.a.remove(14);
            if (personMetadataImpl.a.contains(14)) {
                b(personMetadataImpl.n);
            }
            this.a.remove(15);
            if (personMetadataImpl.a.contains(15)) {
                c(personMetadataImpl.o);
            }
        }

        public final void a(Collection collection) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.addAll(collection);
        }

        public final void c(boolean z) {
            this.a.add(15);
            this.o = z;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.b(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                ivx.b(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.b(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.b(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.b(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.b(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                ivx.a(parcel, 8, this.h, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.i, true);
            }
            if (set.contains(10)) {
                ivx.b(parcel, 10, this.j, true);
            }
            if (set.contains(11)) {
                ivx.a(parcel, 11, this.k, true);
            }
            if (set.contains(12)) {
                ivx.a(parcel, 12, this.l, i2, true);
            }
            if (set.contains(13)) {
                ivx.a(parcel, 13, this.m);
            }
            if (set.contains(14)) {
                ivx.a(parcel, 14, this.n);
            }
            if (set.contains(15)) {
                ivx.a(parcel, 15, this.o);
            }
            ivx.b(parcel, a2);
        }

        public final void b(boolean z) {
            this.a.add(14);
            this.n = z;
        }

        public final void a(boolean z) {
            this.a.add(13);
            this.m = z;
        }

        public PersonMetadataImpl(Set set, List list, List list2, List list3, List list4, List list5, List list6, String str, String str2, List list7, String str3, ProfileOwnerStatsImpl profileOwnerStatsImpl, boolean z, boolean z2, boolean z3) {
            this.a = set;
            this.b = list;
            this.c = list2;
            this.d = list3;
            this.e = list4;
            this.f = list5;
            this.g = list6;
            this.h = str;
            this.i = str2;
            this.j = list7;
            this.k = str3;
            this.l = profileOwnerStatsImpl;
            this.m = z;
            this.n = z2;
            this.o = z3;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class PhoneNumbersImpl extends AbstractSafeParcelable implements Person.PhoneNumbers {
        public static final Parcelable.Creator CREATOR = new wyy();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;
        public String f;
        int g;

        public PhoneNumbersImpl() {
            this.a = new HashSet();
        }

        public final void a(int i) {
            this.a.add(7);
            this.g = i;
        }

        public final boolean a() {
            return this.b != null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            return this.b;
        }

        public final boolean d() {
            return this.c != null;
        }

        public final String e() {
            return this.c;
        }

        public final boolean f() {
            return this.d != null;
        }

        public final String g() {
            return this.d;
        }

        public final boolean h() {
            return this.e != null;
        }

        public final String i() {
            return this.e;
        }

        public final boolean j() {
            return this.f != null;
        }

        public final String k() {
            return this.f;
        }

        public final boolean l() {
            return this.a.contains(7);
        }

        public final int m() {
            return this.g;
        }

        public PhoneNumbersImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3, String str4, int i) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                ivx.a(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                ivx.b(parcel, 7, this.g);
            }
            ivx.b(parcel, a2);
        }

        public PhoneNumbersImpl(wzp wzp) {
            this();
            this.b = null;
            if (wzp.a()) {
                this.b = new MetadataImpl(wzp.c());
            }
            this.c = null;
            if (wzp.d()) {
                this.c = wzp.e();
            }
            this.d = null;
            if (wzp.f()) {
                this.d = wzp.g();
            }
            this.e = null;
            if (wzp.h()) {
                this.e = wzp.i();
            }
            this.f = null;
            if (wzp.j()) {
                this.f = wzp.k();
            }
            this.a.remove(7);
            if (wzp.l()) {
                a(wzp.m());
            }
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class PlacesLivedImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wyz();
        final Set a;
        public MetadataImpl b;
        boolean c;
        public String d;

        public PlacesLivedImpl() {
            this.a = new HashSet();
        }

        public final void a(boolean z) {
            this.a.add(3);
            this.c = z;
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public PlacesLivedImpl(PlacesLivedImpl placesLivedImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = placesLivedImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.a.remove(3);
            if (placesLivedImpl.a.contains(3)) {
                a(placesLivedImpl.c);
            }
            this.d = null;
            String str = placesLivedImpl.d;
            if (str != null) {
                this.d = str;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public PlacesLivedImpl(Set set, MetadataImpl metadataImpl, boolean z, String str) {
            this.a = set;
            this.b = metadataImpl;
            this.c = z;
            this.d = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ProfileOwnerStatsImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new wza();
        final Set a;
        long b;
        long c;

        public ProfileOwnerStatsImpl() {
            this.a = new HashSet();
        }

        public final void a(long j) {
            this.a.add(2);
            this.b = j;
        }

        public final void b(long j) {
            this.a.add(3);
            this.c = j;
        }

        public ProfileOwnerStatsImpl(ProfileOwnerStatsImpl profileOwnerStatsImpl) {
            this();
            this.a.remove(2);
            if (profileOwnerStatsImpl.a.contains(2)) {
                a(profileOwnerStatsImpl.b);
            }
            this.a.remove(3);
            if (profileOwnerStatsImpl.a.contains(3)) {
                b(profileOwnerStatsImpl.c);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c);
            }
            ivx.b(parcel, a2);
        }

        public ProfileOwnerStatsImpl(Set set, long j, long j2) {
            this.a = set;
            this.b = j;
            this.c = j2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class RelationsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wzb();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;

        public RelationsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public RelationsImpl(RelationsImpl relationsImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = relationsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = relationsImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = relationsImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
            this.e = null;
            String str3 = relationsImpl.e;
            if (str3 != null) {
                this.e = str3;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        public RelationsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class RelationshipInterestsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wzc();
        final Set a;
        MetadataImpl b;
        String c;

        public RelationshipInterestsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public RelationshipInterestsImpl(RelationshipInterestsImpl relationshipInterestsImpl) {
            this.a = new HashSet();
            this.b = null;
            MetadataImpl metadataImpl = relationshipInterestsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = relationshipInterestsImpl.c;
            if (str != null) {
                this.c = str;
            }
        }

        public RelationshipInterestsImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class RelationshipStatusesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wzd();
        final Set a;
        MetadataImpl b;
        String c;
        String d;

        public RelationshipStatusesImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public RelationshipStatusesImpl(RelationshipStatusesImpl relationshipStatusesImpl) {
            this.a = new HashSet();
            this.b = null;
            MetadataImpl metadataImpl = relationshipStatusesImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = relationshipStatusesImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = relationshipStatusesImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
        }

        public RelationshipStatusesImpl(Set set, MetadataImpl metadataImpl, String str, String str2) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SkillsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wze();
        final Set a;
        public MetadataImpl b;
        public String c;

        public SkillsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public SkillsImpl(SkillsImpl skillsImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = skillsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = skillsImpl.c;
            if (str != null) {
                this.c = str;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public SkillsImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SortKeysImpl extends AbstractSafeParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new wzf();
        final Set a;
        public String b;
        public String c;

        public SortKeysImpl() {
            this.a = new HashSet();
        }

        public SortKeysImpl(SortKeysImpl sortKeysImpl) {
            this();
            this.b = null;
            String str = sortKeysImpl.b;
            if (str != null) {
                this.b = str;
            }
            this.c = null;
            String str2 = sortKeysImpl.c;
            if (str2 != null) {
                this.c = str2;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public SortKeysImpl(Set set, String str, String str2) {
            this.a = set;
            this.b = str;
            this.c = str2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class TaglinesImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wzg();
        final Set a;
        public MetadataImpl b;
        public String c;

        public TaglinesImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public TaglinesImpl(TaglinesImpl taglinesImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = taglinesImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = taglinesImpl.c;
            if (str != null) {
                this.c = str;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public TaglinesImpl(Set set, MetadataImpl metadataImpl, String str) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class UrlsImpl extends AbstractSafeParcelable implements Person.MetadataHolder, Parcelable, wzn {
        public static final Parcelable.Creator CREATOR = new wzh();
        final Set a;
        public MetadataImpl b;
        public String c;
        public String d;
        public String e;

        public UrlsImpl() {
            this.a = new HashSet();
        }

        public final boolean a() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ Person.Metadata b() {
            throw null;
        }

        public final /* bridge */ /* synthetic */ wzm c() {
            throw null;
        }

        public UrlsImpl(UrlsImpl urlsImpl) {
            this();
            this.b = null;
            MetadataImpl metadataImpl = urlsImpl.b;
            if (metadataImpl != null) {
                this.b = new MetadataImpl(metadataImpl);
            }
            this.c = null;
            String str = urlsImpl.c;
            if (str != null) {
                this.c = str;
            }
            this.d = null;
            String str2 = urlsImpl.d;
            if (str2 != null) {
                this.d = str2;
            }
            this.e = null;
            String str3 = urlsImpl.e;
            if (str3 != null) {
                this.e = str3;
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                ivx.a(parcel, 5, this.e, true);
            }
            ivx.b(parcel, a2);
        }

        public UrlsImpl(Set set, MetadataImpl metadataImpl, String str, String str2, String str3) {
            this.a = set;
            this.b = metadataImpl;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }
    }

    public PersonImpl() {
        this.a = new HashSet();
    }

    public final boolean A() {
        return this.o != null;
    }

    public final List B() {
        return this.o;
    }

    public final boolean C() {
        return this.p != null;
    }

    public final String D() {
        return this.p;
    }

    public final boolean E() {
        return this.q != null;
    }

    public final boolean F() {
        return this.r != null;
    }

    public final List G() {
        return this.r;
    }

    public final boolean H() {
        return this.s != null;
    }

    public final List I() {
        return this.s;
    }

    public final boolean J() {
        return this.t != null;
    }

    public final boolean K() {
        return this.u != null;
    }

    public final List L() {
        return this.u;
    }

    public final boolean M() {
        return this.v != null;
    }

    public final List N() {
        return this.v;
    }

    public final boolean O() {
        return this.w != null;
    }

    public final List P() {
        return this.w;
    }

    public final boolean Q() {
        return this.x != null;
    }

    public final List R() {
        return this.x;
    }

    public final boolean S() {
        return this.y != null;
    }

    public final List T() {
        return this.y;
    }

    public final boolean U() {
        return this.z != null;
    }

    public final List V() {
        return this.z;
    }

    public final boolean W() {
        return this.A != null;
    }

    public final String X() {
        return this.A;
    }

    public final boolean Y() {
        return this.B != null;
    }

    public final List Z() {
        return this.B;
    }

    public final void a(AboutsImpl aboutsImpl) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(aboutsImpl);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean aa() {
        return this.C != null;
    }

    public final List ab() {
        return this.C;
    }

    public final boolean ac() {
        return this.D != null;
    }

    public final List ad() {
        return this.D;
    }

    public final boolean ae() {
        return this.E != null;
    }

    public final List af() {
        return this.E;
    }

    public final boolean ag() {
        return this.F != null;
    }

    public final boolean ah() {
        return this.G != null;
    }

    public final List ai() {
        return this.G;
    }

    public final boolean aj() {
        return this.H != null;
    }

    public final List ak() {
        return this.H;
    }

    public final boolean al() {
        return this.I != null;
    }

    public final List am() {
        return this.I;
    }

    public final /* bridge */ /* synthetic */ SortKeysImpl an() {
        return this.F;
    }

    public final /* bridge */ /* synthetic */ PersonMetadataImpl ao() {
        return this.t;
    }

    public final /* bridge */ /* synthetic */ LegacyFieldsImpl ap() {
        return this.q;
    }

    public final List b() {
        return this.b;
    }

    public final boolean c() {
        return this.c != null;
    }

    public final List d() {
        return this.c;
    }

    public final boolean e() {
        return this.d != null;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.e != null;
    }

    public final List h() {
        return this.e;
    }

    public final boolean i() {
        return this.f != null;
    }

    public final List j() {
        return this.f;
    }

    public final boolean k() {
        return this.g != null;
    }

    public final List l() {
        return this.g;
    }

    public final boolean m() {
        return this.h != null;
    }

    public final List n() {
        return this.h;
    }

    public final boolean o() {
        return this.i != null;
    }

    public final List p() {
        return this.i;
    }

    public final boolean q() {
        return this.j != null;
    }

    public final String r() {
        return this.j;
    }

    public final boolean s() {
        return this.k != null;
    }

    public final List t() {
        return this.k;
    }

    public final boolean u() {
        return this.l != null;
    }

    public final List v() {
        return this.l;
    }

    public final boolean w() {
        return this.m != null;
    }

    public final String x() {
        return this.m;
    }

    public final boolean y() {
        return this.n != null;
    }

    public final List z() {
        return this.n;
    }

    public PersonImpl(Set set, List list, List list2, String str, List list3, List list4, List list5, List list6, List list7, String str2, List list8, List list9, String str3, List list10, List list11, String str4, LegacyFieldsImpl legacyFieldsImpl, List list12, List list13, PersonMetadataImpl personMetadataImpl, List list14, List list15, List list16, List list17, List list18, List list19, String str5, List list20, List list21, List list22, List list23, SortKeysImpl sortKeysImpl, List list24, List list25, List list26) {
        this.a = set;
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = list3;
        this.f = list4;
        this.g = list5;
        this.h = list6;
        this.i = list7;
        this.j = str2;
        this.k = list8;
        this.l = list9;
        this.m = str3;
        this.n = list10;
        this.o = list11;
        this.p = str4;
        this.q = legacyFieldsImpl;
        this.r = list12;
        this.s = list13;
        this.t = personMetadataImpl;
        this.u = list14;
        this.v = list15;
        this.w = list16;
        this.x = list17;
        this.y = list18;
        this.z = list19;
        this.A = str5;
        this.B = list20;
        this.C = list21;
        this.D = list22;
        this.E = list23;
        this.F = sortKeysImpl;
        this.G = list24;
        this.H = list25;
        this.I = list26;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(2)) {
            ivx.c(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            ivx.c(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            ivx.c(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            ivx.c(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            ivx.c(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            ivx.c(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            ivx.c(parcel, 9, this.i, true);
        }
        if (set.contains(10)) {
            ivx.a(parcel, 10, this.j, true);
        }
        if (set.contains(11)) {
            ivx.c(parcel, 11, this.k, true);
        }
        if (set.contains(12)) {
            ivx.c(parcel, 12, this.l, true);
        }
        if (set.contains(13)) {
            ivx.a(parcel, 13, this.m, true);
        }
        if (set.contains(14)) {
            ivx.c(parcel, 14, this.n, true);
        }
        if (set.contains(15)) {
            ivx.c(parcel, 15, this.o, true);
        }
        if (set.contains(16)) {
            ivx.a(parcel, 16, this.p, true);
        }
        if (set.contains(17)) {
            ivx.a(parcel, 17, this.q, i2, true);
        }
        if (set.contains(18)) {
            ivx.c(parcel, 18, this.r, true);
        }
        if (set.contains(19)) {
            ivx.c(parcel, 19, this.s, true);
        }
        if (set.contains(20)) {
            ivx.a(parcel, 20, this.t, i2, true);
        }
        if (set.contains(21)) {
            ivx.c(parcel, 21, this.u, true);
        }
        if (set.contains(22)) {
            ivx.c(parcel, 22, this.v, true);
        }
        if (set.contains(23)) {
            ivx.c(parcel, 23, this.w, true);
        }
        if (set.contains(24)) {
            ivx.c(parcel, 24, this.x, true);
        }
        if (set.contains(25)) {
            ivx.c(parcel, 25, this.y, true);
        }
        if (set.contains(26)) {
            ivx.c(parcel, 26, this.z, true);
        }
        if (set.contains(27)) {
            ivx.a(parcel, 27, this.A, true);
        }
        if (set.contains(28)) {
            ivx.c(parcel, 28, this.B, true);
        }
        if (set.contains(29)) {
            ivx.c(parcel, 29, this.C, true);
        }
        if (set.contains(30)) {
            ivx.c(parcel, 30, this.D, true);
        }
        if (set.contains(31)) {
            ivx.c(parcel, 31, this.E, true);
        }
        if (set.contains(32)) {
            ivx.a(parcel, 32, this.F, i2, true);
        }
        if (set.contains(33)) {
            ivx.c(parcel, 33, this.G, true);
        }
        if (set.contains(34)) {
            ivx.c(parcel, 34, this.H, true);
        }
        if (set.contains(35)) {
            ivx.c(parcel, 35, this.I, true);
        }
        ivx.b(parcel, a2);
    }

    public PersonImpl(wzq wzq) {
        this();
        this.b = null;
        if (wzq.a()) {
            for (AboutsImpl aboutsImpl : wzq.b()) {
                a(new AboutsImpl(aboutsImpl));
            }
        }
        this.c = null;
        if (wzq.c()) {
            for (AddressesImpl addressesImpl : wzq.d()) {
                a(new AddressesImpl(addressesImpl));
            }
        }
        this.d = null;
        if (wzq.e()) {
            this.d = wzq.f();
        }
        this.e = null;
        if (wzq.g()) {
            for (BirthdaysImpl birthdaysImpl : wzq.h()) {
                a(new BirthdaysImpl(birthdaysImpl));
            }
        }
        this.f = null;
        if (wzq.i()) {
            for (BraggingRightsImpl braggingRightsImpl : wzq.j()) {
                a(new BraggingRightsImpl(braggingRightsImpl));
            }
        }
        this.g = null;
        if (wzq.k()) {
            for (CoverPhotosImpl coverPhotosImpl : wzq.l()) {
                a(new CoverPhotosImpl(coverPhotosImpl));
            }
        }
        this.h = null;
        if (wzq.m()) {
            for (CustomFieldsImpl customFieldsImpl : wzq.n()) {
                a(new CustomFieldsImpl(customFieldsImpl));
            }
        }
        this.i = null;
        if (wzq.o()) {
            for (wzj emailsImpl : wzq.p()) {
                a(new EmailsImpl(emailsImpl));
            }
        }
        this.j = null;
        if (wzq.q()) {
            this.j = wzq.r();
        }
        this.k = null;
        if (wzq.s()) {
            for (EventsImpl eventsImpl : wzq.t()) {
                a(new EventsImpl(eventsImpl));
            }
        }
        this.l = null;
        if (wzq.u()) {
            for (GendersImpl gendersImpl : wzq.v()) {
                a(new GendersImpl(gendersImpl));
            }
        }
        this.m = null;
        if (wzq.w()) {
            this.m = wzq.x();
        }
        this.n = null;
        if (wzq.y()) {
            for (wzk imagesImpl : wzq.z()) {
                a(new ImagesImpl(imagesImpl));
            }
        }
        this.o = null;
        if (wzq.A()) {
            for (InstantMessagingImpl instantMessagingImpl : wzq.B()) {
                a(new InstantMessagingImpl(instantMessagingImpl));
            }
        }
        this.p = null;
        if (wzq.C()) {
            this.p = wzq.D();
        }
        this.q = null;
        if (wzq.E()) {
            this.q = new LegacyFieldsImpl(wzq.ap());
        }
        this.r = null;
        if (wzq.F()) {
            for (wzq personImpl : wzq.G()) {
                PersonImpl personImpl2 = new PersonImpl(personImpl);
                if (this.r == null) {
                    this.r = new ArrayList();
                }
                this.r.add(personImpl2);
            }
        }
        this.s = null;
        if (wzq.H()) {
            for (wzl membershipsImpl : wzq.I()) {
                a(new MembershipsImpl(membershipsImpl));
            }
        }
        this.t = null;
        if (wzq.J()) {
            this.t = new PersonMetadataImpl(wzq.ao());
        }
        this.u = null;
        if (wzq.K()) {
            for (wzo namesImpl : wzq.L()) {
                a(new NamesImpl(namesImpl));
            }
        }
        this.v = null;
        if (wzq.M()) {
            for (NicknamesImpl nicknamesImpl : wzq.N()) {
                a(new NicknamesImpl(nicknamesImpl));
            }
        }
        this.w = null;
        if (wzq.O()) {
            for (OccupationsImpl occupationsImpl : wzq.P()) {
                a(new OccupationsImpl(occupationsImpl));
            }
        }
        this.x = null;
        if (wzq.Q()) {
            for (OrganizationsImpl organizationsImpl : wzq.R()) {
                a(new OrganizationsImpl(organizationsImpl));
            }
        }
        this.y = null;
        if (wzq.S()) {
            for (wzp phoneNumbersImpl : wzq.T()) {
                a(new PhoneNumbersImpl(phoneNumbersImpl));
            }
        }
        this.z = null;
        if (wzq.U()) {
            for (PlacesLivedImpl placesLivedImpl : wzq.V()) {
                a(new PlacesLivedImpl(placesLivedImpl));
            }
        }
        this.A = null;
        if (wzq.W()) {
            this.A = wzq.X();
        }
        this.B = null;
        if (wzq.Y()) {
            for (RelationsImpl relationsImpl : wzq.Z()) {
                a(new RelationsImpl(relationsImpl));
            }
        }
        this.C = null;
        if (wzq.aa()) {
            for (RelationshipInterestsImpl relationshipInterestsImpl : wzq.ab()) {
                RelationshipInterestsImpl relationshipInterestsImpl2 = new RelationshipInterestsImpl(relationshipInterestsImpl);
                if (this.C == null) {
                    this.C = new ArrayList();
                }
                this.C.add(relationshipInterestsImpl2);
            }
        }
        this.D = null;
        if (wzq.ac()) {
            for (RelationshipStatusesImpl relationshipStatusesImpl : wzq.ad()) {
                RelationshipStatusesImpl relationshipStatusesImpl2 = new RelationshipStatusesImpl(relationshipStatusesImpl);
                if (this.D == null) {
                    this.D = new ArrayList();
                }
                this.D.add(relationshipStatusesImpl2);
            }
        }
        this.E = null;
        if (wzq.ae()) {
            for (SkillsImpl skillsImpl : wzq.af()) {
                a(new SkillsImpl(skillsImpl));
            }
        }
        this.F = null;
        if (wzq.ag()) {
            this.F = new SortKeysImpl(wzq.an());
        }
        this.G = null;
        if (wzq.ah()) {
            for (TaglinesImpl taglinesImpl : wzq.ai()) {
                a(new TaglinesImpl(taglinesImpl));
            }
        }
        this.H = null;
        if (wzq.aj()) {
            for (UrlsImpl urlsImpl : wzq.ak()) {
                a(new UrlsImpl(urlsImpl));
            }
        }
        this.I = null;
        if (wzq.al()) {
            for (NotesImpl notesImpl : wzq.am()) {
                a(new NotesImpl(notesImpl));
            }
        }
    }

    public final void a(AddressesImpl addressesImpl) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(addressesImpl);
    }

    public final void a(BirthdaysImpl birthdaysImpl) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(birthdaysImpl);
    }

    public final void a(BraggingRightsImpl braggingRightsImpl) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(braggingRightsImpl);
    }

    public final void a(CoverPhotosImpl coverPhotosImpl) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(coverPhotosImpl);
    }

    public final void a(CustomFieldsImpl customFieldsImpl) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(customFieldsImpl);
    }

    public final void a(EmailsImpl emailsImpl) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(emailsImpl);
    }

    public final void a(EventsImpl eventsImpl) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(eventsImpl);
    }

    public final void a(GendersImpl gendersImpl) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(gendersImpl);
    }

    public final void a(ImagesImpl imagesImpl) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(imagesImpl);
    }

    public final void a(InstantMessagingImpl instantMessagingImpl) {
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(instantMessagingImpl);
    }

    public final void a(MembershipsImpl membershipsImpl) {
        if (this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(membershipsImpl);
    }

    public final void a(NamesImpl namesImpl) {
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(namesImpl);
    }

    public final void a(NicknamesImpl nicknamesImpl) {
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(nicknamesImpl);
    }

    public final void a(NotesImpl notesImpl) {
        if (this.I == null) {
            this.I = new ArrayList();
        }
        this.I.add(notesImpl);
    }

    public final void a(OccupationsImpl occupationsImpl) {
        if (this.w == null) {
            this.w = new ArrayList();
        }
        this.w.add(occupationsImpl);
    }

    public final void a(OrganizationsImpl organizationsImpl) {
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(organizationsImpl);
    }

    public final void a(PhoneNumbersImpl phoneNumbersImpl) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(phoneNumbersImpl);
    }

    public final void a(PlacesLivedImpl placesLivedImpl) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(placesLivedImpl);
    }

    public final void a(RelationsImpl relationsImpl) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(relationsImpl);
    }

    public final void a(SkillsImpl skillsImpl) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(skillsImpl);
    }

    public final void a(TaglinesImpl taglinesImpl) {
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.add(taglinesImpl);
    }

    public final void a(UrlsImpl urlsImpl) {
        if (this.H == null) {
            this.H = new ArrayList();
        }
        this.H.add(urlsImpl);
    }
}
