import {env} from "./environment.ts";

// DEV
export const host = (path: string) =>
  `${env.server.protocol}://${env.server.host}:${env.server.port}/${env.server.contextPath}/${path}`

