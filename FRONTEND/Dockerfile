FROM node:latest as front-end
WORKDIR /app
##COPY package.json package-lock.json ./
COPY . .
RUN npm install
RUN npm run build --prod

### STAGE 2: Run ###
FROM nginx:alpine
COPY --from=front-end /app/dist/eCommerce /usr/share/nginx/html
##EXPOSE 80
##CMD ["nginx", "-g", "daemon off;"]