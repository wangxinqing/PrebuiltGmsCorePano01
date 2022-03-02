package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: wtp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wtp {
    static {
        amzy.a((Object) "email_gaia_map", (Object) "facl_application");
    }

    public static anaf a() {
        String a = wtq.a("owners", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "account_name TEXT NOT NULL", "gaia_id TEXT", "page_gaia_id TEXT", "display_name TEXT", "avatar TEXT", "cover_photo_url TEXT", "cover_photo_height INTEGER NOT NULL DEFAULT 0", "cover_photo_width INTEGER NOT NULL DEFAULT 0", "cover_photo_id TEXT", "last_sync_start_time INTEGER NOT NULL DEFAULT 0", "last_sync_finish_time INTEGER NOT NULL DEFAULT 0", "last_sync_status INTEGER NOT NULL DEFAULT 0", "last_successful_sync_time INTEGER NOT NULL DEFAULT 0", "sync_to_contacts INTEGER NOT NULL DEFAULT 0", "is_dasher INTEGER NOT NULL DEFAULT 0", "dasher_domain TEXT", "etag TEXT", "sync_circles_to_contacts INTEGER NOT NULL DEFAULT 0", "sync_evergreen_to_contacts INTEGER NOT NULL DEFAULT 0", "last_full_people_sync_time INTEGER NOT NULL DEFAULT 0", "is_active_plus_account INTEGER NOT NULL DEFAULT 0", "sync_me_to_contacts INTEGER NOT NULL DEFAULT 0", "given_name TEXT", "family_name TEXT", "contacts_backup_and_sync INTEGER NOT NULL DEFAULT 0");
        String a2 = wtq.a("owner_sync_requests", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "account_name TEXT NOT NULL", "page_gaia_id TEXT", "sync_requested_time INTEGER NOT NULL DEFAULT 0", wtq.a("account_name", "page_gaia_id"));
        String a3 = wtq.a("people", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "gaia_id TEXT", "v2_id TEXT NOT NULL", "name TEXT", "given_name TEXT", "family_name TEXT", "middle_name TEXT", "name_verified INTEGER NOT NULL DEFAULT 0", "profile_type INTEGER NOT NULL", "sort_key TEXT", "sort_key_last_name TEXT", "sort_key_irank TEXT", "avatar TEXT", "tagline TEXT", "blocked INTEGER NOT NULL DEFAULT 0", "etag TEXT", "last_modified INTEGER NOT NULL DEFAULT 0", "invisible_3p INTEGER NOT NULL DEFAULT 0", "in_viewer_domain INTEGER NOT NULL DEFAULT 0", "in_circle INTEGER NOT NULL DEFAULT 0", "in_contacts INTEGER NOT NULL DEFAULT 0", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", "people_in_common TEXT", "sync_is_alive INTEGER NOT NULL DEFAULT 0", "logging_id TEXT", "logging_id2 TEXT", "logging_id3 TEXT", "logging_id4 TEXT", "logging_id5 TEXT", "mobile_owner_id TEXT", "name_visibility TEXT DEFAULT 'public'", "avatar_visibility TEXT DEFAULT 'public'", wtq.a("owner_id", "qualified_id"), wtq.a("owner_id", "owners", "_id"));
        String a4 = wtq.a("sync_tokens", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "name TEXT NOT NULL", "value TEXT NOT NULL", wtq.a("owner_id", "name"), wtq.a("owner_id", "owners", "_id"));
        String a5 = wtq.a("circles", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "circle_id TEXT NOT NULL", "name TEXT", "sort_key TEXT", "type INTEGER NOT NULL", "for_sharing INTEGER NOT NULL DEFAULT 0", "people_count INTEGER NOT NULL DEFAULT -1", "client_policies INTEGER NOT NULL DEFAULT 0", "etag TEXT", "last_modified INTEGER NOT NULL DEFAULT 0", "sync_to_contacts INTEGER NOT NULL DEFAULT 0", wtq.a("owner_id", "circle_id"), wtq.a("owner_id", "owners", "_id"));
        String a6 = wtq.a("emails", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "email TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", "logging_id TEXT", "logging_id2 TEXT", "logging_id3 TEXT", "logging_id4 TEXT", "logging_id5 TEXT", wtq.a(amzy.a((Object) "owner_id", (Object) "qualified_id"), "people", amzy.a((Object) "owner_id", (Object) "qualified_id"), 1));
        String a7 = wtq.a("phones", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "phone TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", wtq.a(amzy.a((Object) "owner_id", (Object) "qualified_id"), "people", amzy.a((Object) "owner_id", (Object) "qualified_id"), 1));
        String a8 = wtq.a("postal_address", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "postal_address TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", wtq.a(amzy.a((Object) "owner_id", (Object) "qualified_id"), "people", amzy.a((Object) "owner_id", (Object) "qualified_id"), 1));
        String a9 = wtq.a("owner_emails", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "email TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", wtq.a("owner_id", "owners", "_id"));
        String a10 = wtq.a("owner_phones", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "phone TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", wtq.a("owner_id", "owners", "_id"));
        String a11 = wtq.a("owner_postal_address", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "postal_address TEXT NOT NULL", "type INTEGER NOT NULL", "custom_label TEXT", wtq.a("owner_id", "owners", "_id"));
        String str = a8;
        iva.b(true, "Must have at least one key.");
        String str2 = a6;
        String a12 = wtq.a("circle_members", "owner_id INTEGER NOT NULL", "qualified_id TEXT NOT NULL", "circle_id TEXT NOT NULL", String.format("PRIMARY KEY (%s)", new Object[]{TextUtils.join(",", new String[]{"owner_id", "qualified_id", "circle_id"})}), wtq.a(amzy.a((Object) "owner_id", (Object) "qualified_id"), "people", amzy.a((Object) "owner_id", (Object) "qualified_id"), 1), wtq.a(amzy.a((Object) "owner_id", (Object) "circle_id"), "circles", amzy.a((Object) "owner_id", (Object) "circle_id"), 1));
        String a13 = wtq.a("gaia_id_map", "owner_id INTEGER NOT NULL", "contact_id TEXT NOT NULL", "value TEXT NOT NULL", "gaia_id TEXT NOT NULL", "type INTEGER NOT NULL", wtq.a("owner_id", "contact_id", "value"), wtq.a("owner_id", "owners", "_id"));
        String a14 = wtq.a("applications", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", wtq.a("owner_id", "dev_console_id"), wtq.a("owner_id", "owners", "_id"));
        String str3 = a12;
        String a15 = wtq.a("application_packages", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", "package_name TEXT NOT NULL", "certificate_hash TEXT NOT NULL", wtq.a(amzy.a((Object) "owner_id", (Object) "dev_console_id"), "applications", amzy.a((Object) "owner_id", (Object) "dev_console_id"), 1));
        String a16 = wtq.a("facl_people", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "dev_console_id TEXT NOT NULL", "qualified_id TEXT NOT NULL", wtq.b("owner_id", "dev_console_id", "qualified_id"), wtq.a(amzy.a((Object) "owner_id", (Object) "qualified_id"), "people", amzy.a((Object) "owner_id", (Object) "qualified_id"), 1), wtq.a(amzy.a((Object) "owner_id", (Object) "dev_console_id"), "applications", amzy.a((Object) "owner_id", (Object) "dev_console_id"), 1));
        String a17 = wtq.a("ac_people", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "owner_id INTEGER NOT NULL", "people_v2_id TEXT NOT NULL", "qualified_id TEXT", "sync_is_alive INTEGER NOT NULL DEFAULT 0", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", "logging_id TEXT", "logging_id2 TEXT", "logging_id3 TEXT", "logging_id4 TEXT", "logging_id5 TEXT", "last_update_time INTEGER NOT NULL DEFAULT 0", wtq.a("owner_id", "people_v2_id"), wtq.a("owner_id", "owners", "_id"));
        String a18 = wtq.a("ac_container", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "people_id INTEGER NOT NULL", "container_type INTEGER NOT NULL", "profile_type INTEGER NOT NULL", "gaia_id TEXT", "contact_id TEXT", "compressed_avatar_url TEXT", "has_avatar INTEGER NOT NULL DEFAULT 0", "in_circle INTEGER NOT NULL DEFAULT 0", "in_viewer_domain INTEGER NOT NULL DEFAULT 0", "display_name TEXT", "formatted_name TEXT", "given_name TEXT", "family_name TEXT", "middle_name TEXT", "honorific_prefix TEXT", "honorific_suffix TEXT", "yomi_given_name TEXT", "yomi_family_name TEXT", "yomi_honorific_prefix TEXT", "yomi_honorific_suffix TEXT", "nickname TEXT", wtq.a("people_id", "ac_people", "_id"));
        String a19 = wtq.a("ac_item", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "container_id INTEGER NOT NULL", "item_type INTEGER NOT NULL", "is_edge_key INTEGER", "value TEXT NOT NULL", "value2 TEXT", "value_type INTEGER", "custom_label TEXT", "affinity1 REAL", "affinity2 REAL", "affinity3 REAL", "affinity4 REAL", "affinity5 REAL", "logging_id TEXT", "logging_id2 TEXT", "logging_id3 TEXT", "logging_id4 TEXT", "logging_id5 TEXT", "certificate_expiration_millis INTEGER NOT NULL DEFAULT 0", "certificate_status TEXT", wtq.a("container_id", "ac_container", "_id"));
        String a20 = wtq.a("search_index", "person_id INTEGER NOT NULL", "kind INTEGER NOT NULL", "value TEXT NOT NULL", wtq.a("person_id", "people", "_id"));
        String a21 = wtq.a("ac_index", "item_id INTEGER NOT NULL", "owner_id INTEGER NOT NULL", "is_normalized INTEGER NOT NULL", "kind INTEGER NOT NULL", "value TEXT NOT NULL COLLATE NOCASE", wtq.a("owner_id", "owners", "_id"), wtq.a("item_id", "ac_item", "_id"));
        String a22 = wtq.a("properties", "name TEXT NOT NULL PRIMARY KEY", "value TEXT");
        String a23 = wtq.a("temp_gaia_ordinal", "ordinal INTEGER NOT NULL", "gaia_id TEXT NULL", "qualified_id TEXT NOT NULL");
        anab h = anaf.h();
        h.a("owners", a);
        h.a("owner_sync_requests", a2);
        h.a("people", a3);
        h.a("sync_tokens", a4);
        h.a("circles", a5);
        h.a("emails", str2);
        h.a("phones", a7);
        h.a("postal_address", str);
        h.a("owner_emails", a9);
        h.a("owner_phones", a10);
        h.a("owner_postal_address", a11);
        h.a("circle_members", str3);
        h.a("gaia_id_map", a13);
        h.a("applications", a14);
        h.a("application_packages", a15);
        h.a("facl_people", a16);
        h.a("ac_people", a17);
        h.a("ac_container", a18);
        h.a("ac_item", a19);
        h.a("search_index", a20);
        h.a("ac_index", a21);
        h.a("properties", a22);
        h.a("temp_gaia_ordinal", a23);
        return h.a();
    }

    public static anaf b() {
        String b = wtq.b("email_person", "emails", "owner_id", "qualified_id");
        String b2 = wtq.b("phone_person", "phones", "owner_id", "qualified_id");
        String b3 = wtq.b("postal_address_person", "postal_address", "owner_id", "qualified_id");
        String a = wtq.a("search_value", "search_index", "value");
        String a2 = wtq.a("search_person_id_index", "search_index", "person_id");
        String a3 = wtq.a("ac_index_1", "ac_index", "owner_id", "value", "kind");
        String a4 = wtq.a("ac_index_item_id", "ac_index", "item_id");
        String str = a4;
        String str2 = "ac_item";
        String a5 = wtq.a("ac_item_container", "ac_item", "container_id");
        String a6 = wtq.a("ac_item_container_person_id", "ac_container", "people_id");
        String a7 = wtq.a("ac_people_v2_id", "ac_people", "owner_id", "people_v2_id");
        anab h = anaf.h();
        h.a("email_person", b);
        h.a("phone_person", b2);
        h.a("postal_address_person", b3);
        h.a("search_value", a);
        h.a("search_person_id_index", a2);
        h.a("ac_index_1", a3);
        h.a("ac_index_item_id", str);
        h.a("ac_item_container", a5);
        h.a("ac_item_container_person_id", a6);
        h.a("ac_people_v2_id", a7);
        xip.a();
        if (((Boolean) xho.a.a()).booleanValue() && !((Boolean) xhp.a.a()).booleanValue()) {
            h.a("ac_item_affinity_1", wtq.a("ac_item_affinity_1", str2, "item_type", "affinity1"));
        }
        return h.a();
    }

    public static anaf c() {
        String[] strArr = {"p.people_v2_id AS v2_id", "c.container_type AS container_type", "c.profile_type AS profile_type", "coalesce(c.gaia_id,c2.gaia_id) AS gaia_id", "c.contact_id AS contact_id", "c.has_avatar AS has_cp2_avatar", "c.display_name AS display_name", "coalesce(c.compressed_avatar_url,c2.compressed_avatar_url) AS compressed_avatar_url", "p.owner_id AS owner_id", "p.affinity1 AS person_affinity1", "p.affinity2 AS person_affinity2", "p.affinity3 AS person_affinity3", "p.affinity4 AS person_affinity4", "p.affinity5 AS person_affinity5", "p.logging_id AS person_logging_id1", "p.logging_id2 AS person_logging_id2", "p.logging_id3 AS person_logging_id3", "p.logging_id4 AS person_logging_id4", "p.logging_id5 AS person_logging_id5", "i.item_type AS item_type", "i.value AS value", "i.value2 AS value2", "i.value_type AS value_type", "i.custom_label AS custom_label", "i.affinity1 AS item_affinity1", "i.affinity2 AS item_affinity2", "i.affinity3 AS item_affinity3", "i.affinity4 AS item_affinity4", "i.affinity5 AS item_affinity5", "i.logging_id AS item_logging_id1", "i.logging_id2 AS item_logging_id2", "i.logging_id3 AS item_logging_id3", "i.logging_id4 AS item_logging_id4", "i.logging_id5 AS item_logging_id5", "i.certificate_expiration_millis AS item_certificate_expiration_millis", "i.certificate_status AS item_certificate_status", "i._id AS item_id"};
        String format = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT DISTINCT %s FROM %s AS %s JOIN %s AS %s ON %s=%s JOIN %s AS %s ON %s=%s LEFT JOIN %s AS %s ON %s=%s LEFT JOIN (%s) AS %s ON %s=%s WHERE (%s=%s) AND (%s=%s) AND (%s IS NULL OR (%s=coalesce(%s,%s)));", new Object[]{"ac_main_query_view", TextUtils.join(",", strArr), "ac_people", "p", "ac_container", "c", "p._id", "c.people_id", "ac_item", "i", "c._id", "i.container_id", "gaia_id_map", "m", "i.value", "m.value", String.format(Locale.US, "SELECT %s,%s,%s FROM %s WHERE (%s IS NOT NULL)", new Object[]{"people_id", "gaia_id", "compressed_avatar_url", "ac_container", "compressed_avatar_url"}), "c2", "c.people_id", "c2.people_id", "c.container_type", 1, "i.item_type", 1, "m.gaia_id", "m.gaia_id", "c.gaia_id", "c2.gaia_id"});
        String format2 = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT %s FROM %s AS %s JOIN %s AS %s ON %s=%s JOIN %s AS %s ON %s=%s LEFT JOIN (%s) AS %s ON %s=%s  WHERE (%s=%s) AND (%s=%s);", new Object[]{"ac_main_query_view_legacy", TextUtils.join(",", strArr), "ac_people", "p", "ac_container", "c", "p._id", "c.people_id", "ac_item", "i", "c._id", "i.container_id", String.format(Locale.US, "SELECT %s,%s,%s FROM %s WHERE (%s IS NOT NULL)", new Object[]{"people_id", "gaia_id", "compressed_avatar_url", "ac_container", "compressed_avatar_url"}), "c2", "c.people_id", "c2.people_id", "c.container_type", 1, "i.item_type", 1});
        String format3 = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT %s AS %s,%s AS %s,%s AS %s FROM %s WHERE (%s=%s);", new Object[]{"ac_email_exact_index_view", "item_id", "item_id", "owner_id", "owner_id", "value", "value", "ac_index", "kind", 0});
        String format4 = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT %s AS %s,%s AS %s,%s AS %s FROM %s WHERE (%s=%s);", new Object[]{"ac_email_normalized_index_view", "item_id", "item_id", "owner_id", "owner_id", "value", "value", "ac_index", "kind", 1});
        String format5 = String.format(Locale.US, "CREATE VIEW IF NOT EXISTS %s AS SELECT %s AS %s,%s AS %s,%s AS %s  FROM %s AS %s JOIN %s AS %s ON %s=%s JOIN %s AS %s ON %s=%s WHERE (%s=%s);", new Object[]{"ac_name_search_index_view", "i3._id", "item_id", "x.owner_id", "owner_id", "x.value", "value", "ac_index", "x", "ac_item", "i2", "x.item_id", "i2._id", "ac_item", "i3", "i2.container_id", "i3.container_id", "i2.item_type", 0});
        anab h = anaf.h();
        h.a("ac_main_query_view", format);
        h.a("ac_main_query_view_legacy", format2);
        h.a("ac_email_exact_index_view", format3);
        h.a("ac_email_normalized_index_view", format4);
        h.a("ac_name_search_index_view", format5);
        return h.a();
    }
}
