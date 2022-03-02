package com.google.android.gms.fido.fido2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mzg();
    @Deprecated
    public static final StateUpdate a = new StateUpdate(Type.CANCEL);
    public static final StateUpdate b = new StateUpdate(Type.PAUSE);
    public static final StateUpdate c = new StateUpdate(Type.RESUME);
    public static final StateUpdate d = new StateUpdate(Type.STOP);
    public final String e;
    private final Type f;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum Type implements Parcelable {
        CANCEL("cancel"),
        PAUSE("pause"),
        RESUME("resume"),
        STOP("stop"),
        DEVICE_SELECTION("user_selected_device"),
        SELECT_VIEW("user_selected_view"),
        SELECT_TRANSPORT_VIEW("user_selected_view_for_transport"),
        UPDATE_CURRENT_VIEW("update_current_view");
        
        public static final Parcelable.Creator CREATOR = null;
        public final String i;

        static {
            CREATOR = new mze();
        }

        private Type(String str) {
            this.i = str;
        }

        public static Type a(String str) {
            for (Type type : values()) {
                if (str.equals(type.i)) {
                    return type;
                }
            }
            throw new mzf(str);
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return this.i;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.i);
        }
    }

    public StateUpdate(Type type) {
        this(type, (JSONObject) null);
    }

    public static StateUpdate a(JSONObject jSONObject) {
        if (jSONObject.has("type")) {
            Type a2 = Type.a(jSONObject.getString("type"));
            if (a2.equals(Type.CANCEL) || a2.equals(Type.PAUSE) || a2.equals(Type.RESUME) || a2.equals(Type.STOP)) {
                return new StateUpdate(a2);
            }
            if (jSONObject.has("data")) {
                try {
                    return new StateUpdate(a2, jSONObject.getJSONObject("data"));
                } catch (JSONException e2) {
                    throw new JSONException("malformed required field \"data\"");
                }
            } else {
                String valueOf = String.valueOf(a2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Missing required field \"data\" for \"type\"");
                sb.append(valueOf);
                throw new JSONException(sb.toString());
            }
        } else {
            throw new JSONException("Missing required field \"type\"");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StateUpdate) {
            StateUpdate stateUpdate = (StateUpdate) obj;
            if (!ius.a(this.f, stateUpdate.f) || !ius.a(this.e, stateUpdate.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Type type = this.f;
        Type type2 = Type.CANCEL;
        return Arrays.hashCode(new Object[]{type.i, this.e});
    }

    public StateUpdate(Type type, JSONObject jSONObject) {
        iva.a((Object) type);
        this.f = type;
        if (jSONObject == null) {
            boolean z = true;
            if (!type.equals(Type.CANCEL) && !type.equals(Type.PAUSE) && !type.equals(Type.RESUME) && !type.equals(Type.STOP)) {
                z = false;
            }
            iva.b(z);
            this.e = null;
            return;
        }
        this.e = jSONObject.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Type type = this.f;
        Type type2 = Type.CANCEL;
        ivx.a(parcel, 2, type.i, false);
        ivx.a(parcel, 3, this.e, false);
        ivx.b(parcel, a2);
    }

    public StateUpdate(String str, String str2) {
        iva.a((Object) str);
        try {
            this.f = Type.a(str);
            this.e = str2;
        } catch (mzf e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
