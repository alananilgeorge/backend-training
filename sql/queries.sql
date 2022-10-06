SELECT
concat(p.first_name,' ',p.last_name) AS "Patient Name",
u.email as "Patient email",
concat(ab.street1,',',ab.street2, ',' ,ab.city, ',',ab.country,',',ab.postal_code) as "Address",
dpi.practice_name as "Practice Name",
concat(du.first_name,' ',du.last_name) as "Doctor Name",
concat(ad.street1,',',ad.street2, ',' ,ad.city, ',',ad.country,',',ad.postal_code) as "Doctor Address",
du.email as "Doctor email",
dso.name as "DSO name",
du.id,
dp.doctor_user_id


FROM
patients p
inner join users u
on u.id = p.user_id
inner join address_book ab
on p.user_id = ab.user_id
left outer join treatments t
on t.patient_id = ab.user_id
left outer join users du
on du.id = t.doctor_user_id
left outer join address_book ad
on du.id = ad.user_id
left outer join doctor_profiles dp
on t.doctor_user_id = dp.doctor_user_id
left outer join doctor_practice_informations dpi
on dp.practice_id = dpi.id
left outer join dso
on dpi.dso_id = dso.id
where ab.type = 'PRIMARY' 

