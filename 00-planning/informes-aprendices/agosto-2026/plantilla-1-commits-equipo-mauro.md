# Informe 1 — Commits en el repositorio de documentación y en los repositorios de tu equipo

**Periodo:** del 11 de agosto al 30 de septiembre de 2026 (hora Colombia, UTC-5)
**Repositorio principal de la ficha:** https://github.com/code-sena/ADSO-3145556

| Campo | Valor |
|---|---|
| Aprendiz | Juan Mauricio Suaza Solórzano |
| Usuario de GitHub | mauro-1508 |
| Ficha | ADSO-3145556 |
| Proyecto (equipo) | translates-sign-language (Traduce Señas) |
| Prefijo de los repositorios del equipo | `trans-sl-` |
| Correo(s) con el que haces commit | suazasolorzanoj@gmail.com |
| Fecha de elaboración | 2026-10-06 |

## 1. Resumen

| Repositorio | Enlace | Commits |
|---|---|---|
| `trans-sl-docs` | https://github.com/code-sena/trans-sl-docs | 9 |
| `backendTS` | https://github.com/mauro-1508/backendTS | 29 |
| `frontendTS` | https://github.com/tadeo77789/frontendTS | 44 |
| **Total** | | **82** |

## 2. Repositorio de documentación

### 2.1 `trans-sl-docs`

- **Enlace:** https://github.com/code-sena/trans-sl-docs
- **Total de commits en el periodo:** 9
- **Qué hice (2 a 3 líneas):** Reemplacé las plantillas de dominio por el modelo de Traduce Señas, añadí requisitos y datos, y documenté el dataset LSC-54: formato real, licencia, mediciones, elección de mano, umbral DTW, formato de entrada del modelo y su exportación a TensorFlow.js y TFLite.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [6774d81](https://github.com/code-sena/trans-sl-docs/commit/6774d81) | 2026-09-03 13:30 | docs(domain): replace DDD templates with Traduce Señas domain model |
| [dc66f65](https://github.com/code-sena/trans-sl-docs/commit/dc66f65) | 2026-09-08 22:25 | fix:Requirements were added, and changes were made to the domain. |
| [ea63c92](https://github.com/code-sena/trans-sl-docs/commit/ea63c92) | 2026-09-10 00:36 | feat:i added all the data and modified domain and some requirements |
| [5125a37](https://github.com/code-sena/trans-sl-docs/commit/5125a37) | 2026-09-22 09:45 | docs(data): document LSC-54 real format, licence and fit with the template engine |
| [90cd9b6](https://github.com/code-sena/trans-sl-docs/commit/90cd9b6) | 2026-09-22 10:06 | docs(data): add LSC-54 sample.json measurements |
| [32e59ec](https://github.com/code-sena/trans-sl-docs/commit/32e59ec) | 2026-09-22 14:46 | docs(data): record the hand-choice and DTW threshold findings |
| [5ce1e7d](https://github.com/code-sena/trans-sl-docs/commit/5ce1e7d) | 2026-09-23 14:52 | docs(data): record that two-hand features beat more frames |
| [c465e47](https://github.com/code-sena/trans-sl-docs/commit/c465e47) | 2026-09-29 11:29 | docs(data): document the model input format and training protocol |
| [70c88fb](https://github.com/code-sena/trans-sl-docs/commit/70c88fb) | 2026-09-29 16:34 | docs(data): record how the model is exported to TFJS and TFLite |

## 3. Repositorios del equipo

### 3.1 `backendTS`

- **Enlace:** https://github.com/mauro-1508/backendTS
- **Total de commits en el periodo:** 29
- **Qué hice (2 a 3 líneas):** Pasé el backend a arquitectura hexagonal y lo organicé por dominios. Construí las herramientas de IA para el dataset LSC-54 (descarga, conversión a plantillas, medición de separabilidad DTW), la tabla y los endpoints de sign_templates, y el pipeline de datos, entrenamiento y exportación del modelo.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [981da42](https://github.com/mauro-1508/backendTS/commit/981da42) | 2026-08-20 09:38 | refactor:The architecture was changed, and the hexagonal model was created. |
| [fcbba91](https://github.com/mauro-1508/backendTS/commit/fcbba91) | 2026-09-17 02:08 | fix: return translation confidence as a number |
| [34e4a94](https://github.com/mauro-1508/backendTS/commit/34e4a94) | 2026-09-21 14:48 | Initial commit |
| [03ccc93](https://github.com/mauro-1508/backendTS/commit/03ccc93) | 2026-09-22 09:24 | chore: add .gitignore for node_modules, dist, env files and training data |
| [84165c5](https://github.com/mauro-1508/backendTS/commit/84165c5) | 2026-09-22 09:27 | refactor: organize backend by domains under src/ (shared, auth, users, translations, ia) |
| [7a5dea8](https://github.com/mauro-1508/backendTS/commit/7a5dea8) | 2026-09-22 09:28 | docs: scaffold ia domain with training folders, READMEs and .env.example |
| [82e0f10](https://github.com/mauro-1508/backendTS/commit/82e0f10) | 2026-09-22 09:44 | feat(ia): add LSC-54 streaming inspector and document the dataset format |
| [711fd78](https://github.com/mauro-1508/backendTS/commit/711fd78) | 2026-09-22 10:54 | feat(ia): add ranged rep_0 downloader and DTW separability measurement for LSC-54 |
| [9686afa](https://github.com/mauro-1508/backendTS/commit/9686afa) | 2026-09-22 14:23 | feat(ia): split rep_0 download into slices, handle rate limiting, add team handoff |
| [6a6af2f](https://github.com/mauro-1508/backendTS/commit/6a6af2f) | 2026-09-22 14:31 | docs: spell out the teammate's download task step by step |
| [8d9953b](https://github.com/mauro-1508/backendTS/commit/8d9953b) | 2026-09-22 14:46 | feat(ia): convert LSC-54 samples into app templates, pick the hand per class |
| [c81b88a](https://github.com/mauro-1508/backendTS/commit/c81b88a) | 2026-09-22 14:47 | feat(ia): sweep DTW thresholds and rank signs by top-1 in the separability report |
| [5422fc4](https://github.com/mauro-1508/backendTS/commit/5422fc4) | 2026-09-22 14:51 | feat(ia): add sign_templates table and endpoints to store and share templates |
| [b67ba8e](https://github.com/mauro-1508/backendTS/commit/b67ba8e) | 2026-09-22 15:10 | fix(ia): keep rep_0 samples from segments that start mid-file |
| [0294a1a](https://github.com/mauro-1508/backendTS/commit/0294a1a) | 2026-09-22 15:11 | fix(ia): read dataset key names as UTF-8 and repair already-downloaded ones |
| [29656b0](https://github.com/mauro-1508/backendTS/commit/29656b0) | 2026-09-22 15:12 | docs: tell the teammate to pull before starting |
| [d1df71c](https://github.com/mauro-1508/backendTS/commit/d1df71c) | 2026-09-22 15:29 | feat(ia): add live-window mode to the separability measurement |
| [e01e2ba](https://github.com/mauro-1508/backendTS/commit/e01e2ba) | 2026-09-22 15:55 | feat(ia): add a command to upload converted templates to the backend |
| [c16a013](https://github.com/mauro-1508/backendTS/commit/c16a013) | 2026-09-22 16:56 | fix(ia): log download progress in local time |
| [b03ebed](https://github.com/mauro-1508/backendTS/commit/b03ebed) | 2026-09-23 12:54 | feat(ia): raise the DTW threshold and rescale confidence from the measurement |
| [96ed7e4](https://github.com/mauro-1508/backendTS/commit/96ed7e4) | 2026-09-23 13:11 | feat(ia): fetch single reference videos from the dataset zips by range |
| [e730d96](https://github.com/mauro-1508/backendTS/commit/e730d96) | 2026-09-23 14:52 | feat(ia): build two-hand templates and validate motion vs static dimensions |
| [44d9b3a](https://github.com/mauro-1508/backendTS/commit/44d9b3a) | 2026-09-23 15:44 | feat(ia): summarise how many videos and people each sign has |
| [9c3fcca](https://github.com/mauro-1508/backendTS/commit/9c3fcca) | 2026-09-23 16:46 | perf(ia): skip whole videos when filtering by sign, and save traversal progress |
| [ad9815d](https://github.com/mauro-1508/backendTS/commit/ad9815d) | 2026-09-28 13:29 | pipeline de datos y modelo |
| [a803a6a](https://github.com/mauro-1508/backendTS/commit/a803a6a) | 2026-09-29 10:20 | separar piezas comunes del extractor |
| [deeed84](https://github.com/mauro-1508/backendTS/commit/deeed84) | 2026-09-29 11:16 | ignorar archivos compilados de python |
| [0ceb64d](https://github.com/mauro-1508/backendTS/commit/0ceb64d) | 2026-09-29 16:30 | feat(ia): exportar el modelo a TensorFlow.js y TFLite |
| [a019355](https://github.com/mauro-1508/backendTS/commit/a019355) | 2026-09-29 16:33 | docs(ia): rehacer el notebook de exportacion |

### 3.2 `frontendTS`

- **Enlace:** https://github.com/tadeo77789/frontendTS
- **Total de commits en el periodo:** 44
- **Qué hice (2 a 3 líneas):** Añadí el sistema de logros del perfil y corregí muchas pantallas (cabecera, splash, estadísticas, administración, cámara). Conecté el login y el registro al backend real e incorporé el motor de reconocimiento con MediaPipe y plantillas DTW, y después el modelo entrenado de 20 palabras con su diagnóstico y umbrales.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [6864c22](https://github.com/tadeo77789/frontendTS/commit/6864c22) | 2026-09-16 14:46 | fix:Some versions of Expo that were causing errors were fixed. |
| [a940b2d](https://github.com/tadeo77789/frontendTS/commit/a940b2d) | 2026-09-17 13:51 | feat(i18n): add achievement strings for es, en, fr and pt |
| [d154e1e](https://github.com/tadeo77789/frontendTS/commit/d154e1e) | 2026-09-17 13:52 | feat(profile): add achievement catalog with levels and medal palette |
| [007a686](https://github.com/tadeo77789/frontendTS/commit/007a686) | 2026-09-17 13:54 | feat(profile): add achievements card, medal and detail modal |
| [2c12723](https://github.com/tadeo77789/frontendTS/commit/2c12723) | 2026-09-17 13:55 | feat(profile): place achievements between preferences and about |
| [3ab20d4](https://github.com/tadeo77789/frontendTS/commit/3ab20d4) | 2026-09-20 15:21 | fix(header): make the logo and app name open the home screen |
| [f321d4f](https://github.com/tadeo77789/frontendTS/commit/f321d4f) | 2026-09-20 15:21 | feat(splash): show the app logo on the launch screen |
| [256e00b](https://github.com/tadeo77789/frontendTS/commit/256e00b) | 2026-09-20 15:22 | fix(profile): hide the notifications switch from regular accounts |
| [4d326bc](https://github.com/tadeo77789/frontendTS/commit/4d326bc) | 2026-09-20 15:22 | fix(privacy): move the back button below the status bar |
| [d1432e2](https://github.com/tadeo77789/frontendTS/commit/d1432e2) | 2026-09-20 15:22 | fix(alphabet): drop the duplicated replay button |
| [7e1e62b](https://github.com/tadeo77789/frontendTS/commit/7e1e62b) | 2026-09-20 15:23 | fix(translation): copy the result to the clipboard |
| [db58f50](https://github.com/tadeo77789/frontendTS/commit/db58f50) | 2026-09-20 15:23 | fix(i18n): name the login link terms and conditions |
| [39771ab](https://github.com/tadeo77789/frontendTS/commit/39771ab) | 2026-09-20 15:24 | fix(register): move the back button below the status bar |
| [9ffe701](https://github.com/tadeo77789/frontendTS/commit/9ffe701) | 2026-09-20 15:24 | fix(profile): show the name given at registration |
| [6d3acae](https://github.com/tadeo77789/frontendTS/commit/6d3acae) | 2026-09-20 15:25 | feat(profile): collapse the achievement grid behind a see more button |
| [602c2a8](https://github.com/tadeo77789/frontendTS/commit/602c2a8) | 2026-09-20 15:26 | fix(stats): draw the bar chart inside the detail modal |
| [f8c0bc0](https://github.com/tadeo77789/frontendTS/commit/f8c0bc0) | 2026-09-20 15:26 | style(stats): repaint the KPI cards with one colour ramp |
| [1eef2cc](https://github.com/tadeo77789/frontendTS/commit/1eef2cc) | 2026-09-20 15:27 | fix(stats): let the detail modal scroll |
| [393fbfd](https://github.com/tadeo77789/frontendTS/commit/393fbfd) | 2026-09-20 15:27 | fix(admin): drop the 5 from the training alphabet |
| [3fa53dd](https://github.com/tadeo77789/frontendTS/commit/3fa53dd) | 2026-09-20 15:27 | fix(admin): keep the word field visible when the keyboard opens |
| [f50c593](https://github.com/tadeo77789/frontendTS/commit/f50c593) | 2026-09-20 15:28 | fix(admin): make the record gesture button respond |
| [b3ce6a9](https://github.com/tadeo77789/frontendTS/commit/b3ce6a9) | 2026-09-21 13:20 | feat(admin): split training into alphabet and words sections |
| [7f8a075](https://github.com/tadeo77789/frontendTS/commit/7f8a075) | 2026-09-21 13:21 | fix(stats): draw the line chart inside the detail modal |
| [163a1f2](https://github.com/tadeo77789/frontendTS/commit/163a1f2) | 2026-09-21 13:22 | fix(camera): silence the shutter sound and animation |
| [1ac9159](https://github.com/tadeo77789/frontendTS/commit/1ac9159) | 2026-09-21 13:22 | fix(camera): only take a picture when the provider reads it |
| [d8579c3](https://github.com/tadeo77789/frontendTS/commit/d8579c3) | 2026-09-22 09:31 | fix(auth): connect AuthContext to the real backend login and register |
| [4e84845](https://github.com/tadeo77789/frontendTS/commit/4e84845) | 2026-09-22 09:33 | feat(translation): port MediaPipe words engine with engine toggle on the translation screen |
| [98a09ba](https://github.com/tadeo77789/frontendTS/commit/98a09ba) | 2026-09-22 14:54 | feat(translation): sync sign templates with the backend |
| [8918b9b](https://github.com/tadeo77789/frontendTS/commit/8918b9b) | 2026-09-23 12:54 | feat(translation): accept dataset templates by retuning the DTW threshold |
| [eb9adba](https://github.com/tadeo77789/frontendTS/commit/eb9adba) | 2026-09-23 13:40 | feat(translation): show which template matched and how far, to diagnose failures |
| [7713103](https://github.com/tadeo77789/frontendTS/commit/7713103) | 2026-09-23 14:53 | feat(translation): compare both hands in the word engine |
| [b44874f](https://github.com/tadeo77789/frontendTS/commit/b44874f) | 2026-09-29 11:29 | feat(translation): run the trained model with pose landmarks, latency and unsure state |
| [dcee02c](https://github.com/tadeo77789/frontendTS/commit/dcee02c) | 2026-09-29 16:11 | fix(translation): accept both TensorFlow.js model formats |
| [9a574ed](https://github.com/tadeo77789/frontendTS/commit/9a574ed) | 2026-09-29 16:31 | chore(translation): carpeta para el modelo de palabras |
| [e382858](https://github.com/tadeo77789/frontendTS/commit/e382858) | 2026-09-29 16:53 | fix(translation): no traducir si el modelo y las glosas no concuerdan |
| [1ce63ea](https://github.com/tadeo77789/frontendTS/commit/1ce63ea) | 2026-09-29 17:04 | feat(translation): modelo de 20 palabras entrenado con LSC-54 |
| [c3ff11f](https://github.com/tadeo77789/frontendTS/commit/c3ff11f) | 2026-09-30 00:25 | fix(history): leer el historial con los nombres que devuelve el backend |
| [3b7b806](https://github.com/tadeo77789/frontendTS/commit/3b7b806) | 2026-09-30 00:39 | fix(translation): dejar de predecir sin manos y de repetir la ultima seña |
| [fb76d9f](https://github.com/tadeo77789/frontendTS/commit/fb76d9f) | 2026-09-30 00:55 | fix(config): apuntar el movil al backend por la IP del PC en desarrollo |
| [efdd6db](https://github.com/tadeo77789/frontendTS/commit/efdd6db) | 2026-09-30 01:03 | chore(translation): lscPeek, diagnostico de la ventana en vivo contra el dataset |
| [9cd2fd2](https://github.com/tadeo77789/frontendTS/commit/9cd2fd2) | 2026-09-30 01:26 | fix(translation): clasificar señas completas en vez de una ventana fija |
| [d206042](https://github.com/tadeo77789/frontendTS/commit/d206042) | 2026-09-30 11:10 | chore(translation): bitacora por seña en consola, con el motivo de cada rechazo |
| [b99ed51](https://github.com/tadeo77789/frontendTS/commit/b99ed51) | 2026-09-30 11:42 | feat(translation): umbrales calibrables en caliente y estados del reconocedor |
| [acbf0d6](https://github.com/tadeo77789/frontendTS/commit/acbf0d6) | 2026-09-30 13:35 | fix(translation): silenciar "por favor", que es la respuesta por defecto |

## 4. Verificación del aprendiz

- [ ] Todos los commits listados los hice con mi cuenta (aparece mi foto de perfil en GitHub).
- [ ] Incluí los commits de **todas las ramas**, no solo de `main`.
- [ ] Todos los commits caen entre el 11 de agosto y el 30 de septiembre de 2026 (hora Colombia).
- [ ] Cada enlace de commit abre en GitHub.
- [ ] Los repositorios en los que no tengo commits quedaron en la tabla con 0.
- [ ] El total de cada repositorio coincide con el número de filas de su tabla.

## 5. Observaciones

- **Periodo:** del 11 de agosto al 30 de septiembre de 2026, hora Colombia. Se usa la fecha de autor de cada commit (la que muestra GitHub).
- **Repositorios del equipo:** el equipo trabaja en `code-sena/trans-sl-docs` (documentación), `mauro-1508/backendTS` (backend y base de datos) y `tadeo77789/frontendTS` (app móvil y web). Los repositorios `trans-sl-api`, `trans-sl-app`, `trans-sl-db` y `trans-sl-portal` no existen en `code-sena`.
- **Cómo se contó:** todas las ramas subidas a GitHub, sin commits de fusión (*Merge pull request…*). Un commit que está en varias ramas se cuenta una sola vez. Datos actualizados desde GitHub el 2026-10-06; los commits posteriores al 30 de septiembre no se incluyen.
- **Cuenta:** se comprobó en GitHub que los commits aparecen vinculados a mi cuenta `mauro-1508`.
- **Visibilidad:** `trans-sl-docs` es privado (conviene confirmar que el instructor `ariel5253` puede abrir los enlaces); `backendTS` y `frontendTS` son públicos.
- **Ramas sin fusionar:** 6 de mis commits en `trans-sl-docs` (los de `06-data` sobre LSC-54 y el modelo, del 22 al 29 de septiembre) están solo en la rama `feat/dataset-lsc54`, aún sin fusionar.

---

*Declaro que la información de este informe es veraz y que los commits listados son de mi autoría.*

**Aprendiz:** ______________________  **Fecha:** ______________
