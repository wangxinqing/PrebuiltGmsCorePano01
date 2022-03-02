package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CommentEntity extends FastSafeParcelableJsonResponse implements ilq {
    public static final Parcelable.Creator CREATOR = new zgq();
    private static final HashMap k;
    final Set a;
    final int b;
    ActorEntity c;
    public String d;
    List e;
    ObjectEntity f;
    PlusonersEntity g;
    String h;
    StatusForViewerEntity i;
    String j;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ActorEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new zgr();
        private static final HashMap d;
        final Set a;
        final int b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("displayName", FastJsonResponse$Field.f("displayName", 2));
        }

        public ActorEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return d;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ActorEntity)) {
                return false;
            }
            if (this != obj) {
                ActorEntity actorEntity = (ActorEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!actorEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(actorEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (actorEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public final /* bridge */ /* synthetic */ Object r() {
            return this;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = str2;
                this.a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public ActorEntity(Set set, int i, String str) {
            this.a = set;
            this.b = i;
            this.c = str;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class InReplyToEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new zgs();
        private static final HashMap e;
        final Set a;
        final int b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("id", FastJsonResponse$Field.f("id", 2));
            e.put("url", FastJsonResponse$Field.f("url", 3));
        }

        public InReplyToEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return e;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.c;
            }
            if (i == 3) {
                return this.d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InReplyToEntity)) {
                return false;
            }
            if (this != obj) {
                InReplyToEntity inReplyToEntity = (InReplyToEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!inReplyToEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(inReplyToEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (inReplyToEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public final /* bridge */ /* synthetic */ Object r() {
            return this;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = str2;
            } else if (i == 3) {
                this.d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.c, true);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.d, true);
            }
            ivx.b(parcel, a2);
        }

        public InReplyToEntity(Set set, int i, String str, String str2) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ObjectEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new zgt();
        private static final HashMap d;
        final Set a;
        final int b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("content", FastJsonResponse$Field.f("content", 2));
        }

        public ObjectEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return d;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectEntity)) {
                return false;
            }
            if (this != obj) {
                ObjectEntity objectEntity = (ObjectEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!objectEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(objectEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (objectEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public final /* bridge */ /* synthetic */ Object r() {
            return this;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = str2;
                this.a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            if (set.contains(2)) {
                ivx.a(parcel, 2, this.c, true);
            }
            ivx.b(parcel, a2);
        }

        public ObjectEntity(Set set, int i, String str) {
            this.a = set;
            this.b = i;
            this.c = str;
        }

        public ObjectEntity(Set set, String str) {
            this.a = set;
            this.b = 1;
            this.c = str;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class PlusonersEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new zgu();
        private static final HashMap d;
        final Set a;
        final int b;
        int c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("totalItems", FastJsonResponse$Field.a("totalItems", 2));
        }

        public PlusonersEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return d;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return Integer.valueOf(this.c);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PlusonersEntity)) {
                return false;
            }
            if (this != obj) {
                PlusonersEntity plusonersEntity = (PlusonersEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!plusonersEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(plusonersEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (plusonersEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public final /* bridge */ /* synthetic */ Object r() {
            return this;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 2) {
                this.c = i;
                this.a.add(Integer.valueOf(i2));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            if (set.contains(2)) {
                ivx.b(parcel, 2, this.c);
            }
            ivx.b(parcel, a2);
        }

        public PlusonersEntity(Set set, int i, int i2) {
            this.a = set;
            this.b = i;
            this.c = i2;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class StatusForViewerEntity extends FastSafeParcelableJsonResponse implements ilq {
        public static final Parcelable.Creator CREATOR = new zgv();
        private static final HashMap d;
        final Set a;
        final int b;
        boolean c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("isPlusOned", FastJsonResponse$Field.e("isPlusOned", 3));
        }

        public StatusForViewerEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return d;
        }

        /* access modifiers changed from: protected */
        public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                return Boolean.valueOf(this.c);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof StatusForViewerEntity)) {
                return false;
            }
            if (this != obj) {
                StatusForViewerEntity statusForViewerEntity = (StatusForViewerEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (a(fastJsonResponse$Field)) {
                        if (!statusForViewerEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(statusForViewerEntity.b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (statusForViewerEntity.a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public final /* bridge */ /* synthetic */ Object r() {
            return this;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = z;
                this.a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            Set set = this.a;
            if (set.contains(1)) {
                ivx.b(parcel, 1, this.b);
            }
            if (set.contains(3)) {
                ivx.a(parcel, 3, this.c);
            }
            ivx.b(parcel, a2);
        }

        public StatusForViewerEntity(Set set, int i, boolean z) {
            this.a = set;
            this.b = i;
            this.c = z;
        }

        /* access modifiers changed from: protected */
        public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put("actor", FastJsonResponse$Field.a("actor", 2, ActorEntity.class));
        k.put("id", FastJsonResponse$Field.f("id", 4));
        k.put("inReplyTo", FastJsonResponse$Field.b("inReplyTo", 5, InReplyToEntity.class));
        k.put("object", FastJsonResponse$Field.a("object", 7, ObjectEntity.class));
        k.put("plusoners", FastJsonResponse$Field.a("plusoners", 8, PlusonersEntity.class));
        k.put("published", FastJsonResponse$Field.f("published", 9));
        k.put("statusForViewer", FastJsonResponse$Field.a("statusForViewer", 11, StatusForViewerEntity.class));
        k.put("updated", FastJsonResponse$Field.f("updated", 12));
    }

    public CommentEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return k;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 7:
                return this.f;
            case 8:
                return this.g;
            case 9:
                return this.h;
            case 11:
                return this.i;
            case 12:
                return this.j;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CommentEntity)) {
            return false;
        }
        if (this != obj) {
            CommentEntity commentEntity = (CommentEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : k.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!commentEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(commentEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (commentEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : k.values()) {
            if (a(fastJsonResponse$Field)) {
                i2 = i2 + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = (ActorEntity) jag;
        } else if (i2 == 11) {
            this.i = (StatusForViewerEntity) jag;
        } else if (i2 == 7) {
            this.f = (ObjectEntity) jag;
        } else if (i2 == 8) {
            this.g = (PlusonersEntity) jag;
        } else {
            String canonicalName = jag.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.a(parcel, 2, this.c, i2, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            ivx.c(parcel, 5, this.e, true);
        }
        if (set.contains(7)) {
            ivx.a(parcel, 7, this.f, i2, true);
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.g, i2, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.h, true);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.i, i2, true);
        }
        if (set.contains(12)) {
            ivx.a(parcel, 12, this.j, true);
        }
        ivx.b(parcel, a2);
    }

    public CommentEntity(Set set, int i2, ActorEntity actorEntity, String str, List list, ObjectEntity objectEntity, PlusonersEntity plusonersEntity, String str2, StatusForViewerEntity statusForViewerEntity, String str3) {
        this.a = set;
        this.b = i2;
        this.c = actorEntity;
        this.d = str;
        this.e = list;
        this.f = objectEntity;
        this.g = plusonersEntity;
        this.h = str2;
        this.i = statusForViewerEntity;
        this.j = str3;
    }

    public CommentEntity(Set set, ObjectEntity objectEntity) {
        this.a = set;
        this.b = 1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = objectEntity;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 4) {
            this.d = str2;
        } else if (i2 == 9) {
            this.h = str2;
        } else if (i2 == 12) {
            this.j = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.e = arrayList;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
