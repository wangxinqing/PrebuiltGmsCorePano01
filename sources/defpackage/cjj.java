package defpackage;

/* renamed from: cjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface cjj {
    public static final String[] a = {"_id", "context_id", "context_name", "module_id", "time_type", "start_time", "end_time", "context_family", "proto_blob", "string_key1", "string_key2", "string_key3", "version", "sync_state", "sync_state_mod_time_millis"};
    public static final String[] b = {"INTEGER PRIMARY KEY", "TEXT UNIQUE NOT NULL", "INTEGER", "TEXT NOT NULL", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "BLOB", "TEXT", "TEXT", "TEXT", "INTEGER NOT NULL", "INTEGER NOT NULL", "sync_state_mod_time_millis"};
    public static final String[][] c = {new String[]{"context_name", "start_time", "end_time"}, new String[]{"sync_state"}};
}
