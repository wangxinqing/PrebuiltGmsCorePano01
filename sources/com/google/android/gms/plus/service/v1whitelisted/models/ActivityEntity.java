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
public final class ActivityEntity extends FastSafeParcelableJsonResponse implements zfa {
    public static final Parcelable.Creator CREATOR = new zfb();
    private static final HashMap l;
    final Set a;
    final int b;
    AclEntity c;
    String d;
    public String e;
    public ObjectEntity f;
    String g;
    String h;
    String i;
    public String j;
    String k;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class ObjectEntity extends FastSafeParcelableJsonResponse implements zez {
        public static final Parcelable.Creator CREATOR = new zfc();
        private static final HashMap h;
        final Set a;
        final int b;
        ActorEntity c;
        public List d;
        String e;
        PlusonersEntity f;
        RepliesEntity g;

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class ActorEntity extends FastSafeParcelableJsonResponse implements ilq {
            public static final Parcelable.Creator CREATOR = new zfd();
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
        public final class AttachmentsEntity extends FastSafeParcelableJsonResponse implements zex {
            public static final Parcelable.Creator CREATOR = new zfe();
            private static final HashMap k;
            public final Set a;
            final int b;
            public ActionEntity c;
            public String d;
            DeepLinkEntity e;
            public String f;
            public ImageEntity g;
            public String h;
            List i;
            String j;

            /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
            public final class ActionEntity extends FastSafeParcelableJsonResponse implements ilq {
                public static final Parcelable.Creator CREATOR = new zff();
                private static final HashMap f;
                final Set a;
                final int b;
                DeepLinkEntity c;
                public String d;
                String e;

                /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
                public final class DeepLinkEntity extends FastSafeParcelableJsonResponse implements ilq {
                    public static final Parcelable.Creator CREATOR = new zfg();
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

                    public DeepLinkEntity() {
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
                        if (!(obj instanceof DeepLinkEntity)) {
                            return false;
                        }
                        if (this != obj) {
                            DeepLinkEntity deepLinkEntity = (DeepLinkEntity) obj;
                            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                                if (a(fastJsonResponse$Field)) {
                                    if (!deepLinkEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(deepLinkEntity.b(fastJsonResponse$Field))) {
                                        return false;
                                    }
                                } else if (deepLinkEntity.a(fastJsonResponse$Field)) {
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

                    public DeepLinkEntity(Set set, int i, String str, String str2) {
                        this.a = set;
                        this.b = i;
                        this.c = str;
                        this.d = str2;
                    }

                    public DeepLinkEntity(Set set, String str, String str2) {
                        this.a = set;
                        this.b = 1;
                        this.c = str;
                        this.d = str2;
                    }

                    /* access modifiers changed from: protected */
                    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                    }
                }

                static {
                    HashMap hashMap = new HashMap();
                    f = hashMap;
                    hashMap.put("deepLink", FastJsonResponse$Field.a("deepLink", 2, DeepLinkEntity.class));
                    f.put("displayName", FastJsonResponse$Field.f("displayName", 3));
                    f.put("type", FastJsonResponse$Field.f("type", 4));
                }

                public ActionEntity() {
                    this.b = 1;
                    this.a = new HashSet();
                }

                public final /* bridge */ /* synthetic */ Map a() {
                    return f;
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
                    if (i == 4) {
                        return this.e;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof ActionEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        ActionEntity actionEntity = (ActionEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!actionEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(actionEntity.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (actionEntity.a(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                        if (a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                public final /* bridge */ /* synthetic */ Object r() {
                    return this;
                }

                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        this.c = (DeepLinkEntity) jag;
                        this.a.add(Integer.valueOf(i));
                        return;
                    }
                    String canonicalName = jag.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not a known custom type.  Found ");
                    sb.append(canonicalName);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
                }

                public final void writeToParcel(Parcel parcel, int i) {
                    int a2 = ivx.a(parcel);
                    Set set = this.a;
                    if (set.contains(1)) {
                        ivx.b(parcel, 1, this.b);
                    }
                    if (set.contains(2)) {
                        ivx.a(parcel, 2, this.c, i, true);
                    }
                    if (set.contains(3)) {
                        ivx.a(parcel, 3, this.d, true);
                    }
                    if (set.contains(4)) {
                        ivx.a(parcel, 4, this.e, true);
                    }
                    ivx.b(parcel, a2);
                }

                public ActionEntity(Set set, int i, DeepLinkEntity deepLinkEntity, String str, String str2) {
                    this.a = set;
                    this.b = i;
                    this.c = deepLinkEntity;
                    this.d = str;
                    this.e = str2;
                }

                public ActionEntity(Set set, DeepLinkEntity deepLinkEntity, String str) {
                    this.a = set;
                    this.b = 1;
                    this.c = deepLinkEntity;
                    this.d = null;
                    this.e = str;
                }

                /* access modifiers changed from: protected */
                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 3) {
                        this.d = str2;
                    } else if (i == 4) {
                        this.e = str2;
                    } else {
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.a.add(Integer.valueOf(i));
                }

                /* access modifiers changed from: protected */
                public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }
            }

            /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
            public final class DeepLinkEntity extends FastSafeParcelableJsonResponse implements ilq {
                public static final Parcelable.Creator CREATOR = new zfh();
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

                public DeepLinkEntity() {
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
                    if (!(obj instanceof DeepLinkEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        DeepLinkEntity deepLinkEntity = (DeepLinkEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!deepLinkEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(deepLinkEntity.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (deepLinkEntity.a(fastJsonResponse$Field)) {
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

                public DeepLinkEntity(Set set, int i, String str, String str2) {
                    this.a = set;
                    this.b = i;
                    this.c = str;
                    this.d = str2;
                }

                public DeepLinkEntity(Set set, String str) {
                    this.a = set;
                    this.b = 1;
                    this.c = str;
                    this.d = null;
                }

                /* access modifiers changed from: protected */
                public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }
            }

            /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
            public final class ImageEntity extends FastSafeParcelableJsonResponse implements ilq {
                public static final Parcelable.Creator CREATOR = new zfi();
                private static final HashMap d;
                final Set a;
                final int b;
                public String c;

                static {
                    HashMap hashMap = new HashMap();
                    d = hashMap;
                    hashMap.put("url", FastJsonResponse$Field.f("url", 4));
                }

                public ImageEntity() {
                    this.b = 1;
                    this.a = new HashSet();
                }

                public final /* bridge */ /* synthetic */ Map a() {
                    return d;
                }

                /* access modifiers changed from: protected */
                public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 4) {
                        return this.c;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof ImageEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        ImageEntity imageEntity = (ImageEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!imageEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(imageEntity.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (imageEntity.a(fastJsonResponse$Field)) {
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
                    if (i == 4) {
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
                    if (set.contains(4)) {
                        ivx.a(parcel, 4, this.c, true);
                    }
                    ivx.b(parcel, a2);
                }

                public ImageEntity(Set set, int i, String str) {
                    this.a = set;
                    this.b = i;
                    this.c = str;
                }

                public ImageEntity(Set set, String str) {
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
            public final class ThumbnailsEntity extends FastSafeParcelableJsonResponse implements ilq {
                public static final Parcelable.Creator CREATOR = new zfj();
                private static final HashMap e;
                final Set a;
                final int b;
                ImageEntity c;
                String d;

                /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
                public final class ImageEntity extends FastSafeParcelableJsonResponse implements ilq {
                    public static final Parcelable.Creator CREATOR = new zfk();
                    private static final HashMap d;
                    final Set a;
                    final int b;
                    String c;

                    static {
                        HashMap hashMap = new HashMap();
                        d = hashMap;
                        hashMap.put("url", FastJsonResponse$Field.f("url", 4));
                    }

                    public ImageEntity() {
                        this.b = 1;
                        this.a = new HashSet();
                    }

                    public final /* bridge */ /* synthetic */ Map a() {
                        return d;
                    }

                    /* access modifiers changed from: protected */
                    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                        int i = fastJsonResponse$Field.g;
                        if (i == 4) {
                            return this.c;
                        }
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unknown safe parcelable id=");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof ImageEntity)) {
                            return false;
                        }
                        if (this != obj) {
                            ImageEntity imageEntity = (ImageEntity) obj;
                            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                                if (a(fastJsonResponse$Field)) {
                                    if (!imageEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(imageEntity.b(fastJsonResponse$Field))) {
                                        return false;
                                    }
                                } else if (imageEntity.a(fastJsonResponse$Field)) {
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
                        if (i == 4) {
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
                        if (set.contains(4)) {
                            ivx.a(parcel, 4, this.c, true);
                        }
                        ivx.b(parcel, a2);
                    }

                    public ImageEntity(Set set, int i, String str) {
                        this.a = set;
                        this.b = i;
                        this.c = str;
                    }

                    /* access modifiers changed from: protected */
                    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                    }
                }

                static {
                    HashMap hashMap = new HashMap();
                    e = hashMap;
                    hashMap.put("image", FastJsonResponse$Field.a("image", 4, ImageEntity.class));
                    e.put("url", FastJsonResponse$Field.f("url", 5));
                }

                public ThumbnailsEntity() {
                    this.b = 1;
                    this.a = new HashSet();
                }

                public final /* bridge */ /* synthetic */ Map a() {
                    return e;
                }

                /* access modifiers changed from: protected */
                public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 4) {
                        return this.c;
                    }
                    if (i == 5) {
                        return this.d;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof ThumbnailsEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        ThumbnailsEntity thumbnailsEntity = (ThumbnailsEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                            if (a(fastJsonResponse$Field)) {
                                if (!thumbnailsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(thumbnailsEntity.b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (thumbnailsEntity.a(fastJsonResponse$Field)) {
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

                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 4) {
                        this.c = (ImageEntity) jag;
                        this.a.add(Integer.valueOf(i));
                        return;
                    }
                    String canonicalName = jag.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not a known custom type.  Found ");
                    sb.append(canonicalName);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
                }

                public final void writeToParcel(Parcel parcel, int i) {
                    int a2 = ivx.a(parcel);
                    Set set = this.a;
                    if (set.contains(1)) {
                        ivx.b(parcel, 1, this.b);
                    }
                    if (set.contains(4)) {
                        ivx.a(parcel, 4, this.c, i, true);
                    }
                    if (set.contains(5)) {
                        ivx.a(parcel, 5, this.d, true);
                    }
                    ivx.b(parcel, a2);
                }

                public ThumbnailsEntity(Set set, int i, ImageEntity imageEntity, String str) {
                    this.a = set;
                    this.b = i;
                    this.c = imageEntity;
                    this.d = str;
                }

                /* access modifiers changed from: protected */
                public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 5) {
                        this.d = str2;
                        this.a.add(Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                }

                /* access modifiers changed from: protected */
                public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                k = hashMap;
                hashMap.put("action", FastJsonResponse$Field.a("action", 2, ActionEntity.class));
                k.put("content", FastJsonResponse$Field.f("content", 4));
                k.put("deepLink", FastJsonResponse$Field.a("deepLink", 5, DeepLinkEntity.class));
                k.put("displayName", FastJsonResponse$Field.f("displayName", 6));
                k.put("image", FastJsonResponse$Field.a("image", 10, ImageEntity.class));
                k.put("objectType", FastJsonResponse$Field.f("objectType", 11));
                k.put("thumbnails", FastJsonResponse$Field.b("thumbnails", 13, ThumbnailsEntity.class));
                k.put("url", FastJsonResponse$Field.f("url", 14));
            }

            public AttachmentsEntity() {
                this.b = 1;
                this.a = new HashSet();
            }

            public final /* bridge */ /* synthetic */ Map a() {
                return k;
            }

            /* access modifiers changed from: protected */
            public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i2 = fastJsonResponse$Field.g;
                if (i2 == 2) {
                    return this.c;
                }
                if (i2 == 4) {
                    return this.d;
                }
                if (i2 == 5) {
                    return this.e;
                }
                if (i2 == 6) {
                    return this.f;
                }
                if (i2 == 10) {
                    return this.g;
                }
                if (i2 == 11) {
                    return this.h;
                }
                if (i2 == 13) {
                    return this.i;
                }
                if (i2 == 14) {
                    return this.j;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof AttachmentsEntity)) {
                    return false;
                }
                if (this != obj) {
                    AttachmentsEntity attachmentsEntity = (AttachmentsEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : k.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!attachmentsEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(attachmentsEntity.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (attachmentsEntity.a(fastJsonResponse$Field)) {
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
                    this.c = (ActionEntity) jag;
                } else if (i2 == 5) {
                    this.e = (DeepLinkEntity) jag;
                } else if (i2 == 10) {
                    this.g = (ImageEntity) jag;
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
                    ivx.a(parcel, 5, this.e, i2, true);
                }
                if (set.contains(6)) {
                    ivx.a(parcel, 6, this.f, true);
                }
                if (set.contains(10)) {
                    ivx.a(parcel, 10, this.g, i2, true);
                }
                if (set.contains(11)) {
                    ivx.a(parcel, 11, this.h, true);
                }
                if (set.contains(13)) {
                    ivx.c(parcel, 13, this.i, true);
                }
                if (set.contains(14)) {
                    ivx.a(parcel, 14, this.j, true);
                }
                ivx.b(parcel, a2);
            }

            public AttachmentsEntity(Set set, int i2, ActionEntity actionEntity, String str, DeepLinkEntity deepLinkEntity, String str2, ImageEntity imageEntity, String str3, List list, String str4) {
                this.a = set;
                this.b = i2;
                this.c = actionEntity;
                this.d = str;
                this.e = deepLinkEntity;
                this.f = str2;
                this.g = imageEntity;
                this.h = str3;
                this.i = list;
                this.j = str4;
            }

            public AttachmentsEntity(Set set, ActionEntity actionEntity, String str, DeepLinkEntity deepLinkEntity, String str2, ImageEntity imageEntity, String str3, String str4) {
                this.a = set;
                this.b = 1;
                this.c = actionEntity;
                this.d = str;
                this.e = deepLinkEntity;
                this.f = str2;
                this.g = imageEntity;
                this.h = str3;
                this.i = null;
                this.j = str4;
            }

            /* access modifiers changed from: protected */
            public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                int i2 = fastJsonResponse$Field.g;
                if (i2 == 4) {
                    this.d = str2;
                } else if (i2 == 6) {
                    this.f = str2;
                } else if (i2 == 11) {
                    this.h = str2;
                } else if (i2 == 14) {
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
                if (i2 == 13) {
                    this.i = arrayList;
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

        /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
        public final class PlusonersEntity extends FastSafeParcelableJsonResponse implements ilq {
            public static final Parcelable.Creator CREATOR = new zfl();
            private static final HashMap d;
            final Set a;
            final int b;
            int c;

            static {
                HashMap hashMap = new HashMap();
                d = hashMap;
                hashMap.put("totalItems", FastJsonResponse$Field.a("totalItems", 3));
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
                if (i == 3) {
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
                if (i2 == 3) {
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
                if (set.contains(3)) {
                    ivx.b(parcel, 3, this.c);
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
        public final class RepliesEntity extends FastSafeParcelableJsonResponse implements ilq {
            public static final Parcelable.Creator CREATOR = new zfm();
            private static final HashMap d;
            final Set a;
            final int b;
            int c;

            static {
                HashMap hashMap = new HashMap();
                d = hashMap;
                hashMap.put("totalItems", FastJsonResponse$Field.a("totalItems", 4));
            }

            public RepliesEntity() {
                this.b = 1;
                this.a = new HashSet();
            }

            public final /* bridge */ /* synthetic */ Map a() {
                return d;
            }

            /* access modifiers changed from: protected */
            public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 4) {
                    return Integer.valueOf(this.c);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof RepliesEntity)) {
                    return false;
                }
                if (this != obj) {
                    RepliesEntity repliesEntity = (RepliesEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                        if (a(fastJsonResponse$Field)) {
                            if (!repliesEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(repliesEntity.b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (repliesEntity.a(fastJsonResponse$Field)) {
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
                if (i2 == 4) {
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
                if (set.contains(4)) {
                    ivx.b(parcel, 4, this.c);
                }
                ivx.b(parcel, a2);
            }

            public RepliesEntity(Set set, int i, int i2) {
                this.a = set;
                this.b = i;
                this.c = i2;
            }

            /* access modifiers changed from: protected */
            public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            h = hashMap;
            hashMap.put("actor", FastJsonResponse$Field.a("actor", 2, ActorEntity.class));
            h.put("attachments", FastJsonResponse$Field.b("attachments", 3, AttachmentsEntity.class));
            h.put("content", FastJsonResponse$Field.f("content", 4));
            h.put("plusoners", FastJsonResponse$Field.a("plusoners", 9, PlusonersEntity.class));
            h.put("replies", FastJsonResponse$Field.a("replies", 10, RepliesEntity.class));
        }

        public ObjectEntity() {
            this.b = 1;
            this.a = new HashSet();
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return h;
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
            if (i == 4) {
                return this.e;
            }
            if (i == 9) {
                return this.f;
            }
            if (i == 10) {
                return this.g;
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
                for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
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
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public final /* bridge */ /* synthetic */ Object r() {
            return this;
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.c = (ActorEntity) jag;
            } else if (i == 9) {
                this.f = (PlusonersEntity) jag;
            } else if (i == 10) {
                this.g = (RepliesEntity) jag;
            } else {
                String canonicalName = jag.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not a known custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
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
                ivx.a(parcel, 2, this.c, i, true);
            }
            if (set.contains(3)) {
                ivx.c(parcel, 3, this.d, true);
            }
            if (set.contains(4)) {
                ivx.a(parcel, 4, this.e, true);
            }
            if (set.contains(9)) {
                ivx.a(parcel, 9, this.f, i, true);
            }
            if (set.contains(10)) {
                ivx.a(parcel, 10, this.g, i, true);
            }
            ivx.b(parcel, a2);
        }

        public ObjectEntity(Set set, int i, ActorEntity actorEntity, List list, String str, PlusonersEntity plusonersEntity, RepliesEntity repliesEntity) {
            this.a = set;
            this.b = i;
            this.c = actorEntity;
            this.d = list;
            this.e = str;
            this.f = plusonersEntity;
            this.g = repliesEntity;
        }

        public ObjectEntity(Set set, List list, String str) {
            this.a = set;
            this.b = 1;
            this.c = null;
            this.d = list;
            this.e = str;
            this.f = null;
            this.g = null;
        }

        /* access modifiers changed from: protected */
        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.e = str2;
                this.a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.d = arrayList;
                this.a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
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

    static {
        HashMap hashMap = new HashMap();
        l = hashMap;
        hashMap.put("access", FastJsonResponse$Field.a("access", 2, AclEntity.class));
        l.put("annotation", FastJsonResponse$Field.f("annotation", 5));
        l.put("id", FastJsonResponse$Field.f("id", 10));
        l.put("object", FastJsonResponse$Field.a("object", 15, ObjectEntity.class));
        l.put("placeName", FastJsonResponse$Field.f("placeName", 17));
        l.put("published", FastJsonResponse$Field.f("published", 19));
        l.put("updated", FastJsonResponse$Field.f("updated", 23));
        l.put("url", FastJsonResponse$Field.f("url", 24));
        l.put("verb", FastJsonResponse$Field.f("verb", 25));
    }

    public ActivityEntity() {
        this.b = 1;
        this.a = new HashSet();
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return l;
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 5) {
            return this.d;
        }
        if (i2 == 10) {
            return this.e;
        }
        if (i2 == 15) {
            return this.f;
        }
        if (i2 == 17) {
            return this.g;
        }
        if (i2 == 19) {
            return this.h;
        }
        switch (i2) {
            case 23:
                return this.i;
            case 24:
                return this.j;
            case 25:
                return this.k;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActivityEntity)) {
            return false;
        }
        if (this != obj) {
            ActivityEntity activityEntity = (ActivityEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
                if (a(fastJsonResponse$Field)) {
                    if (!activityEntity.a(fastJsonResponse$Field) || !b(fastJsonResponse$Field).equals(activityEntity.b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (activityEntity.a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
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
            this.c = (AclEntity) jag;
        } else if (i2 == 15) {
            this.f = (ObjectEntity) jag;
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
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.d, true);
        }
        if (set.contains(10)) {
            ivx.a(parcel, 10, this.e, true);
        }
        if (set.contains(15)) {
            ivx.a(parcel, 15, this.f, i2, true);
        }
        if (set.contains(17)) {
            ivx.a(parcel, 17, this.g, true);
        }
        if (set.contains(19)) {
            ivx.a(parcel, 19, this.h, true);
        }
        if (set.contains(23)) {
            ivx.a(parcel, 23, this.i, true);
        }
        if (set.contains(24)) {
            ivx.a(parcel, 24, this.j, true);
        }
        if (set.contains(25)) {
            ivx.a(parcel, 25, this.k, true);
        }
        ivx.b(parcel, a2);
    }

    public ActivityEntity(Set set, int i2, AclEntity aclEntity, String str, String str2, ObjectEntity objectEntity, String str3, String str4, String str5, String str6, String str7) {
        this.a = set;
        this.b = i2;
        this.c = aclEntity;
        this.d = str;
        this.e = str2;
        this.f = objectEntity;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }

    public ActivityEntity(Set set, AclEntity aclEntity, ObjectEntity objectEntity) {
        this.a = set;
        this.b = 1;
        this.c = aclEntity;
        this.d = null;
        this.e = null;
        this.f = objectEntity;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.d = str2;
        } else if (i2 == 10) {
            this.e = str2;
        } else if (i2 == 17) {
            this.g = str2;
        } else if (i2 != 19) {
            switch (i2) {
                case 23:
                    this.i = str2;
                    break;
                case 24:
                    this.j = str2;
                    break;
                case 25:
                    this.k = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.h = str2;
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
